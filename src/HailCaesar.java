//import your necessary java packages here
import java.util.*;
import java.util.concurrent.*;
import java.io.*;

public class HailCaesar {
        
	static String myMessage;
        static int key;
        
        public static void main(String [] args){
                
                System.out.println("Hail Caesar!  Let's get cryptic!");
                System.out.print("Reading your message");
                delay();
                myMessage = readfile("original");
                getKey();
                System.out.print("Encrypting your message");
                delay();
                //encrypt("codedMessage");
                XORE("codedMessageB");
                System.out.print("Decrypting your coded message");
                delay();
                //decrypt("codedMessage");
                XORD("codedMessageB");
        }
        
        
        public static void delay(){
                for(int x=0; x<3;x++){
                        try{
                                TimeUnit.MILLISECONDS.sleep(500);
                        } catch(InterruptedException ex) {
                                Thread.currentThread().interrupt(); }
                        System.out.print(". ");
                }
                System.out.println();
        }

        public static String readfile(String filename)
        {
                try
                {
                        Scanner in = new Scanner(new File(filename));
                        StringBuilder message = new StringBuilder();
                        while (in.hasNextLine())
                        {
                                message.append(in.nextLine() + "\n"); 
                        }
                        in.close();
                        return message.toString();
                }
                catch (Exception e)
                {
                        System.exit(-1);
                        return "";
                }
        }

        public static void getKey()
        {
                System.out.println("Your key?");
                Scanner in = new Scanner(System.in);
                key = in.nextInt();
        }
        
        public static void encrypt(String filename)
        {
                try
                {
                        StringBuilder encryptedMessage = new StringBuilder();
                        PrintStream out = new PrintStream(new File(filename));
                        for (char cur : myMessage.toCharArray())
                        {
                                if (cur > 64 && cur < 91)
                                {
                                        cur += key;
                                        if (cur > 90)
                                                cur -= 26;
                                        encryptedMessage.append(cur);
                                }
                                else if (cur > 96 && cur < 123)
                                {
                                        cur += key;
                                        if (cur > 122)
                                                cur -= 26;
                                        encryptedMessage.append(cur);
                                }
                                else
                                        encryptedMessage.append(cur);
                                        
                        }
                        out.print(encryptedMessage.toString());
                        out.close();
                }
                catch (Exception e)
                {
                        e.printStackTrace();
                }
                
        }
        public static void decrypt(String filename)
        {
                StringBuilder decryptedMessage = new StringBuilder();
                String encryptedMessage = readfile(filename);
                for (char cur : encryptedMessage.toCharArray())
                {
                        if (cur > 64 && cur < 91)
                        {
                                cur -= key;
                                if (cur < 65)
                                        cur += 26;
                                decryptedMessage.append(cur);
                        }
                        else if (cur > 96 && cur < 123)
                        {
                                cur -= key;
                                if (cur < 97)
                                        cur += 26;
                                decryptedMessage.append(cur);
                        }
                        else
                                decryptedMessage.append(cur);
                }
                System.out.println(decryptedMessage.toString());
                
        }

        public static void XORD (String filename)
        {
                
                try
                {
                        FileInputStream in = new FileInputStream(new File(filename));
                        byte[] bytes = new byte[in.available()];
                        in.read(bytes);
                        for (int i = 0; i < bytes.length; i++)
                        {
                                bytes[i] = (byte)(bytes[i] ^ key);
                        }
                        System.out.print(new String(bytes));
                }
                catch (Exception e)
                {
                        e.printStackTrace();
                }
        }
        public static void XORE (String filename)
        {
                try
                {
                        byte[] bytes = myMessage.getBytes();
                        FileOutputStream out = new FileOutputStream(new File(filename));
                        for (int i = 0; i < bytes.length; i++)
                        {
                                bytes[i] = (byte)(bytes[i] ^ key);
                        }
                        out.write(bytes);
                }
                catch (Exception e)
                {
                        e.printStackTrace();
                }
        }



}

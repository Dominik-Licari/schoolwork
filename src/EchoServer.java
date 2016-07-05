import java.net.*;
import java.io.*;
public class EchoServer
{
        public static void main(String[] args)
        {
                if (args.length != 1) 
                {
                        System.err.println("Usage: java EchoServer <port number>");
                        System.exit(1);
                }
                int portNumber = Integer.parseInt(args[0]);
                try
                        (
                                ServerSocket seSo = new ServerSocket(Integer.parseInt(args[0]));
                                Socket clSo = seSo.accept();
                                PrintWriter out = new PrintWriter(clSo.getOutputStream(), true);
                                BufferedReader in = new BufferedReader(new InputStreamReader(clSo.getInputStream())); 
                        )
                {
                        while(in.readLine() == null);
                        out.println("Hello from " + seSo.getInetAddress());
                }
                catch (IOException e)
                {
                        e.printStackTrace();
                }
        }
}

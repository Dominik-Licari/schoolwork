import java.util.*;
public class SportsPhotography {
        
        private StarterPacket photoPacket;
        
        public SportsPhotography()     {
                Scanner keyboard = new Scanner(System.in);
                int packet=0;
        loop:
                do        {
                        System.out.println("Sports Photography");
                        System.out.println("------------------");
                        System.out.println("1. Starter Packet");
                        System.out.println("2. Memory Packet");
                        System.out.println("3. All Star Packet");
                        System.out.println("4. Champion Packet ");
                        System.out.println("5. Collector Packet");
                        System.out.println("6. Quit");
                        
                        System.out.print("Select packet -->");
                        packet = keyboard.nextInt();
                        switch(packet)
                        {
                        case 1:
                                photoPacket = new StarterPacket();
                                break;
                        case 2:
                                photoPacket = new MemoryPacket();
                                break;
                        case 3:
                                photoPacket = new AllStarPacket();
                                break;
                        case 4:            
                                photoPacket = new ChampionPacket();
                                break;
                        case 5:
                                photoPacket = new CollectorPacket();
                                break;
                        case 6:
                                break loop;
                        }
                        System.out.println();
                        System.out.println("Picture Packet");
                        System.out.println("============");
                        System.out.println(photoPacket);
                        System.out.println();
                        System.out.println();
                }
                while(true);
        }
        
        public static void main(String[] args)     {
         	SportsPhotography app = new SportsPhotography();
                System.out.println("Bye!");
        }
}


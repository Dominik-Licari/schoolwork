public class MemoryPacket extends StarterPacket
{
        private int p57;
        private int pW;
        
        public MemoryPacket()
        {
                p57 = pW = 8;
        }
        public String getPacketName()
        {
                return "Memory Packet";
        }
        public String toString()
        {
                return super.toString() + 
                        "\n5 X 7:  " + p57 +
                        "\nWallet: " + pW;
        }
}

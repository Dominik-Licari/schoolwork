public class CollectorPacket extends ChampionPacket
{
        private int pW;
        
        public CollectorPacket()
        {
                pW = 8;
        }
        
        public String getPacketName()
        {
                return "Collector packet";
        }
        
        public String toString()
        {
                return super.toString() +
                        "\nPhoto Wallet:   "+ pW;
        }

}

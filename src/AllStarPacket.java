public class AllStarPacket extends StarterPacket
{
        private int mC;
        private int tC;
        
        public AllStarPacket()
        {
                mC = 1;
                tC = 16;
        }

        public String getPacketName()    
        {
                return "AllStarPacket";
        }

        public String toString()
        {
                return super.toString() +
                        "\nMagazine cover: "+ mC +
                        "\nTrading cards:  "+ tC;
        }

}

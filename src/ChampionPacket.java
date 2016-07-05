public class ChampionPacket extends AllStarPacket
{
        private int p57;
        
        public ChampionPacket()
        {
                p57 = 2;
        }
        
        public String getPacketName()
        {
                return "Champion Packet";
        }
        public String toString()
        {
                return super.toString() +
                        "\n5X7s:           "+ p57;
        }

}

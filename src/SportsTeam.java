public class SportsTeam {
        public final String name;
        private int played;
        private int won;
        private int lost;
        
        public SportsTeam(String n)
        {
                name = n;
                played = 0;
                won = 0;
                lost = 0;
        }
        public SportsTeam(String n, int p, int w, int l)
        {
                name = n;
                played = p;
                won = w;
                lost = l;
        }
        
        public int getWinPercent()
        {
                return (int)(((double)won/played)*100);
        }

        public int getPlayed()
        {
                return played;
        }
        public int getWon()
        {
                return played;
        }
        public int getLost()
        {
                return played;
        }
        public void playGame(char result)
        {
                if (result == 'w') 
                        won++;
                else 
                        lost++;
        }
        public String toString()
        {
                return 
                        "Name:                   " + name + "\n" +
                        "Played:                 " + played + "\n" +
                        "Won:                    " + won + "\n" +
                        "Lost:                   " + lost + "\n" +
                        "Winning Percentage:     " + getWinPercent() + "%";
                
        }
}

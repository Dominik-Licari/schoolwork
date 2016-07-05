public class RaceHorse extends Horse
{
        private int wins;
        public RaceHorse()
        {
                super();
                wins = 0;
        }
        public RaceHorse(String o, int a, double v, int w)
        {
                super(o,a,v);
                wins = w;
        }
        public int getWins()
        {
                return wins;
        }
        public void win()
        {
                ++wins;
        }
        public String toString()
        {
               return super.toString() + "\nWins: " + wins; 
        }
}

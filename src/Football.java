public class Football extends SportsTeam
{
        private int t, i;
        public Football(String n)
        {
                super(n);
        }
        public Football(String n, int p, int w, int l, int t, int i)
        {
                super(n,p,w,l);
                this.t = t;
                this.i = i;
        }
        public double getTDsPGame()
        {
                return (double)this.t/super.getPlayed();
        }
        public double getIsPGame()
        {
                return (double)this.i/super.getPlayed();
        }
        public String toString()
        {
                return super.toString() + "\n" + 
                        "Touchdown:              " + t + "\n"  +
                        "Touchdowns per game:    " + getTDsPGame() + "\n"  +
                        "Interceptions:          " + i + "\n"  +
                        "Interceptions per game: " + getIsPGame();
                
        }
        
}

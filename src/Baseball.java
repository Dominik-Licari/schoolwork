public class Baseball extends SportsTeam
{
        private int h, r, e;
        public Baseball(String n)
        {
                super(n);
        }
        public Baseball(String n, int p, int w, int l, int h, int r, int e)
        {
                super(n,p,w,l);
                this.h = h;
                this.r = r;
                this.e = e;
        }
        public double getHRsPGame()
        {
                return ((double)h/super.getPlayed());
        }
        public double getRBIsPGame()
        {
                return ((double)r/super.getPlayed());
        }
        public double getErrsPGame()
        {
                return ((double)e/super.getPlayed());
        }
        public String toString()
        {
                return super.toString() + "\n" + 
                        "Homeruns                " + h + "\n"  +
                        "Homeruns per game:      " + getHRsPGame() + "\n"  +
                        "RBIs:                   " + r + "\n"  +
                        "RBIs per game:          " + getRBIsPGame() + "\n"  +
                        "Errors:                 " + e + "\n" +
                        "Errors per game:        " + getErrsPGame();
        }
        
}

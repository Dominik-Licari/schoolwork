public class StandardPackage
{
        private int nights;
        public StandardPackage(int n)
        {
                nights = n;
        }
        
        public String getResort()
        {
                return "Wilderness Resort";
        }

        public double getCostPerNight()
        {
                return 100;
        }
        
        public double getTotalCost()
        {
                return nights * getCostPerNight();
        }
        
        public String toString()
        {
                return
                        "Resort:        " + getResort() + "\n" +
                        "Cost per night:" + getCostPerNight() + "\n" +
                        "Nights:        " + nights + "\n" +
                        "Total cost:    " + getTotalCost();
        }
}

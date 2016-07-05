public class PlatinumPackage extends PremiumPackage
{
        public PlatinumPackage(int n)
        {
                super(n);
        }
        public String getResort()
        {
                return "Spa Spectacular resort";
        }
        public double getCostPerNight()
        {
                return 200;
        }
        public String getMealPlan()
        {
                return "Breakfast Lunch and Dinner";
        }
}

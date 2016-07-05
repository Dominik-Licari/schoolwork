public class PremiumPackage extends StandardPackage
{
        public PremiumPackage (int n)
        {
              super(n);  
        }
        
        public String getResort()
        {
                return "Carribean Resort";
        }
        public double getCostPerNight()
        {
                return 150;
        }
        public String getMealPlan()
        {
                return "Breakfast";
        }
        public String toString()
        {
                return super.toString() + 
                        "\nMeal plan:     " + getMealPlan();
        }
}

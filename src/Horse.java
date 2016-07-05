public class Horse
{
        private String owner;
        private int age;
        private double val;
        
        public Horse()
        {
                owner = "";
                age = 0;
                val = 0;
        }
        public Horse(String o, int a, double v)
        {
                owner = o;
                age = a;
                val = v;
        }
        @Override
        public String toString()
        {
                return  "Owner = "+ owner + "\n" +
                        "Age = "+ age + "\n" +
                        "Value = $"+ val;
        }
}

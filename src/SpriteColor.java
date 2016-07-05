public enum SpriteColor
{
        RED, BLUE, GREY;
      
        public static SpriteColor getRandom()
        {
                return values()[(int)(Math.random() * values().length)];
        }
}

public class BasketballTeam
{
	public static void main(String[] args)
	{
		BasketballPlayer player1 = new BasketballPlayer();
		player1.setName("Michael Jordan");
		player1.made2FG(10);
		player1.made3FG(4);
		player1.madeFT(3);
		System.out.println(player1.getName() + " scored " + player1.getPoints() + " points");
		System.out.println();
		BasketballPlayer player2 = new BasketballPlayer();
		player2.setName("Larry Bird");
		player2.made2FG(7);
		player2.made3FG(5);
		player2.madeFT(1);
		System.out.println(player2.getName() + " scored " + player2.getPoints() + " points");
		System.out.println();
		BasketballPlayer player3 = new BasketballPlayer();
		player3.setName("Steve Nash");
		player3.made2FG(4);
		player3.made3FG(2);
		player3.madeFT(8);
		System.out.println(player3.getName() + " scored " + player3.getPoints() + " points");
		System.out.println();
	}
}

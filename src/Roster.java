public class Roster
{
	public static  void main(String[] argv)
	{
		Schuler eins, zwei;
		eins = new Schuler();
		zwei = new Schuler();
		eins.setName("Hans");
		eins.setPunkte(1, 94);
		eins.setPunkte(2, 86);
		eins.setPunkte(3, 88);
		zwei.setName("Klaus");
		zwei.setPunkte(1, 75);
		zwei.setPunkte(2, 86);
		zwei.setPunkte(3, 81);
		System.out.println("Erste: "+ eins.getName());
		System.out.println(eins.getName() + "'s Avg: "+ eins.getAverage());
		System.out.println("");
		System.out.println("Zweite: "+ zwei.getName());
		System.out.println(zwei.getName() + "'s Avg: "+ zwei.getAverage());
		
		System.out.println("");
		System.out.println(eins.toString());
		System.out.println("");
		System.out.println(zwei.toString());
		
	}
}

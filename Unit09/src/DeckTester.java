/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String suits[] = {"a", "b", "c"};
		int values[] = {1, 1, 1};
		String ranks[] = {"1","2", "3"};
		
		Deck d = new Deck(ranks,suits, values);
		System.out.println(d);
		
		String suits1[] = {"lions", "tigers", "bears"};
		int values1[] = {1, 2, 3};
		String ranks1[] = {"1","2", "3"};
		
		Deck e = new Deck(ranks1, suits1, values1);
		System.out.println(e);
		
		String suits2[] = {"spades", "diamonds", "hearts", "clubs"};
		int values2[] = {1,2,3,4, 5, 6,7,8,9,10,11,12};
		String ranks2[] = {"4", "5", "6"};
		
		Deck f = new Deck(ranks2, suits2, values2);
		System.out.println(f);
		
		System.out.println("--------------");
		

		suits = new  String[]{"spades", "diamonds", "hearts", "clubs"};
		values =  new int[]{1,2,3,4, 5, 6,7,8,9,10,11,12,13};
		ranks = new String[]{"Ace", "2", "3","4","5","6","7","8","9","10","Jack", "Queen","King"};
		
		Deck test = new Deck(ranks, suits,values);
		System.out.println(test);
		System.out.println("\nDealt 2 Cards: ");
		System.out.println(test.deal());
		System.out.println(test.deal());
		System.out.println("\n " + test);
		
		

		
	}
}

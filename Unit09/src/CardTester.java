/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card a = new Card("ace", "spades", 1);
		
		
		
		Card b = new Card("5", "clubs", 5);
		System.out.println(b);
		
		Card c = new Card("jack", "diamonds", 11);
		System.out.println(c);
		
	}
}

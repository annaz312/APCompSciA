import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		return containsPairSum11(selectedCards) || containsJQK(selectedCards); 	
		
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		//see three private helper methods
		/*List<Integer> indexList = cardIndexes();
		for (int i = 0; i < indexList.size(); i++){
			int index = indexList.get(i);
			Card card = cardAt(index);
			for (int k = 0; k < indexList.size(); k++){
				Card compareCard = cardAt(k);
				if (11 - (card.pointValue()) == compareCard.pointValue()){return true;}
				else if ()
			}*/
		List<Integer> indexList = cardIndexes();
		for (int i = 0; i < indexList.size(); i++){
			Card card = cardAt(indexList.get(i));
			for (int k = 0; k < indexList.size(); k++){
				Card card2 = cardAt(indexList.get(k));
				List<Integer> twoCards = new ArrayList<Integer>();
				twoCards.add(indexList.get(i));
				twoCards.add(indexList.get(k));
				if (containsPairSum11(twoCards)){return true;}
				if (!(card.pointValue() > 0 && card.pointValue() <= 10) && 
						!(card2.pointValue() > 0 && card2.pointValue() <= 10)){
					for (int l = 0; l < indexList.size();l++){
						List<Integer> threeCards = new ArrayList<Integer>();
						threeCards.add(indexList.get(i));
						threeCards.add(indexList.get(k));
						threeCards.add(indexList.get(l));
						if (containsJQK(threeCards)){return true;}
					}
				}
			}
			
		}

		return false;
	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 ** */
		//cardAt;	
		//ARRAY CONTAINS INDEXES INTO BOARD - CHECK
		if (selectedCards.size() != 2){return false;}
		
		int sum = 0; 
		for (int i = 0 ; i < selectedCards.size(); i++){
			int index = selectedCards.get(i);
			Card card=cardAt(index);
			sum = sum + card.pointValue();
		}
		if (sum == 11)
			return true;
		return false;
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		boolean jackAdded = false, queenAdded = false, kingAdded = false;
		if(selectedCards.size() != 3){return false;}
		for (int i = 0; i < selectedCards.size(); i++){
			Card card = cardAt(selectedCards.get(i));
			if (card.rank().equals("jack")){jackAdded = true;}
			else if (card.rank().equals("queen")){queenAdded = true;}
			else if (card.rank().equals("king")){kingAdded = true;}
		}
		
		return jackAdded && queenAdded && kingAdded;
		
		
	}
}

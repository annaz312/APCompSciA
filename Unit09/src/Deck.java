import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards. It provides several
 * operations including initialize, shuffle, deal, and check if empty.
 */
public class Deck {
	/**
	 * cards contains all the cards in the deck.
	 */

	private Card[] cards = new Card[0];

	/**
	 * size is the number of not-yet-dealt cards. Cards are dealt from the top
	 * (highest index) down. The next card to be dealt is at size - 1.
	 */
	private int size;

	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits, and produces
	 * one of the corresponding card.
	 * 
	 * @param ranks
	 *            is an array containing all of the card ranks.
	 * @param suits
	 *            is an array containing all of the card suits.
	 * @param values
	 *            is an array containing all of the card point values.
	 */

	public Deck(String[] ranks, String[] suits, int[] values) {

		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				// create a new array with ranks[i] and suits[i]
				Card card = new Card(ranks[i], suits[j], values[i]);
				Card[] tempCard = new Card[cards.length + 1];

				for (int k = 0; k < cards.length; k++) {
					tempCard[k] = cards[k];

				}
				tempCard[tempCard.length - 1] = card;
				cards = tempCard;
			}

		}
		size = cards.length;
		shuffle();
	}

	/**
	 * Determines if this deck is empty (no undealt cards).
	 * 
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		if (cards.length == 0) {
			return true;
		}
		return false;

	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * 
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		return size;
	}

	/**
	 * Randomly permute the given collection of cards and reset the size to
	 * represent the entire deck.
	 */
	public void shuffle() {
		int j;
		int len = cards.length;
		Card[] shuffled = new Card[len];

		for (int k = 0; k < len; k++) {
			do {
				j = (int) (Math.random() * len);
			} while (cards[j] == null);
			shuffled[k] = cards[j];
			cards[j] = null;
		}

		for (int i = 0; i < len; i++) {
			cards[i] = shuffled[i];
		}

		size = cards.length;

	}

	/**
	 * Deals a card from this deck.
	 * 
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		Card output = cards[size - 1];
		size--;

		return output;

	}

	/**
	 * Generates and returns a string representation of this deck.
	 * 
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards[k];
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = size; k < cards.length; k++) {
			rtn = rtn + cards[k];
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((cards.length - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}

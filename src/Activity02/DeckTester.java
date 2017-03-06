package Activity02;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
                int[] values = {1, 2, 3, 4};
                String[] ranks = {"A", "B", "C", "D"};
                String[] suits = {"Dog", "Cat", "Mouse", "Bird"};
                 
                Deck d = new Deck(ranks, suits, values);
                System.out.println(d);
	}
}

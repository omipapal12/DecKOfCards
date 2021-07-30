import java.util.Random;
import java.util.ArrayList;

public class DeckOfCards {

	private static String[] suit = { "Spades", "Hearts", "Diamond", "Clubs" };
	private static String[] rank = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	private static String[][] deckOfCards = { suit, rank };

		//This method shuffles the deck of cards
	private void shuffleDeckOfCards(String[][] deckOfCards) {
		Random rand = new Random();
		for (int i = 0; i < deckOfCards.length; i++) {
			String[] tempArray = deckOfCards[i];
			for (int j = 0; j < tempArray.length; j++) {
				// Random for remaining positions.
				int r = j + rand.nextInt(tempArray.length - j);
				// swapping the elements
				String temp = tempArray[r];
				tempArray[r] = tempArray[j];
				tempArray[j] = temp;
			}
			deckOfCards[i] = tempArray;
		}
	}	
}



	

package week6CodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Create the following classes.
//Deck

public class Deck {

	// (List of Card)

	List<Card> cardDeck = new ArrayList<Card>(); // creates an ArrayList to represent the deck.

	public Deck() {
		// creates suits, looping four times for each suit
		for (int suit = 0; suit < 4; suit++) {

			// creates values, looping 13 times for each possible value
			for (int value = 0; value < 13; value++) {
				String cardName = Card.MakeCardName(suit, value);
				cardDeck.add(new Card(value + 2, cardName));
			}
		}
	}

	// randomize deck with shuffle.
	public void shuffle() {
		Collections.shuffle(cardDeck);

	}

	// draw a card - removes and returns the top card of the Cards field
	public Card draw() {
		// get the top card
		Card drawnCard = cardDeck.get(0);
		// remove the top card
		cardDeck.remove(0);
		// return the top card
		return drawnCard;

	}

}

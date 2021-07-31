package week6CodingProject;

import java.util.ArrayList;

public class Player {

	private ArrayList<Card> hand;
	private int score;
	private String name;

	// hand is the player's current hand
	// score is the how many points the player has, and always starts at 0.
	// name is the player's name.
	public Player(String name) {
		hand = new ArrayList<Card>();
		score = 0;
		this.name = name;
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	// score defaults to 0.
	public void setScore(int score) {
		this.score = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// prints out information about the player and calls the describe method for
	// each card in the Hand List
	public void describe() {
		System.out.println(name + "'s current hand:");
		System.out.println();
		for (int cards = 0; cards < hand.size(); cards++) {
			hand.get(cards).describe();
		}
		System.out.println();
		System.out.println("***********************************************************");
		System.out.println();

	}

	// removes and returns the top card of the Hand
	public Card flip() {
		// get the top card of both player's hands
		Card drawnCard = hand.get(0);
		// remove both the cards from each player's hands
		hand.remove(0);
		// compare the two cards to see who won
		return drawnCard;
		// increase the score of the winning player
		// print out the result of the flip
	}

	// takes a Deck as an argument and calls the draw method on the deck, adding the
	// returned Card to the hand field
	public void draw(Deck deckToDrawFrom) {
		// draw the top card
		Card drawnCard = deckToDrawFrom.draw();
		// add the top card to the player's hand
		hand.add(drawnCard);

	}

	// adds 1 to the Player’s score field
	public void incrementScore() {
		score = score + 1;
	}

}

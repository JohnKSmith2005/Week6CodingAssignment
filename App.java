package week6CodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App {

	public static void main(String[] args) {

		// Automatic classic card game War
		// Main App Class

		// Instantiate a Deck and two Players, call the shuffle method on the deck.
		Deck deck = new Deck();
		deck.shuffle();

		// Create two players, named Player 1 and Player 2
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");

		// Using a traditional for loop, iterate 52 times calling the Draw method on the
		// other player each iteration using the Deck you instantiated.
		// In this case, the the draw iteration was 26 times, 2 times per player. Each player now has a hand of 26 cards.
		for (int drawCards = 0; drawCards < 26; drawCards++) {
			player1.draw(deck);
			player2.draw(deck);
		}

		// Using a traditional for loop, iterate 26 times and call the flip method for
		// each player.

		player1.describe();
		player2.describe();

		for (int flips = 0; flips < 26; flips++) {
			// Cards are flipped over.
			Card player1FlippedCard = player1.flip();
			Card player2FlippedCard = player2.flip();
			// Cards are announced
			System.out.print(player1.getName() + " played the " + player1FlippedCard.getName() + " against "
					+ player2.getName() + "'s " + player2FlippedCard.getName() + ".");

			// Compare the value of each card returned by the two player’s flip methods.
			// Call the incrementScore method on the player whose card has the higher value.

			if (player1FlippedCard.getValue() > player2FlippedCard.getValue()) {
				// player one wins and gains a point.
				System.out.println(" Player One scores!");
				player1.incrementScore();

			} else if (player2FlippedCard.getValue() > player1FlippedCard.getValue()) {
				// player two wins and gains a point.
				System.out.println(" Player Two scores!");
				player2.incrementScore();

			} else {
				// tied game, no points are awarded to the players.
				System.out.println(" This round is tied!");
			}

		}
		System.out.println();
		System.out.println("***********************************************************");
		System.out.println();
		
		// Game has ended.
		
		// After the loop, compare the final score from each player.
		// Print the final score of each player and either “Player 1”, “Player 2”, or
		// “Draw” depending on which score is higher or if they are both the same.
		System.out.println("Player One's Final Score: " + player1.getScore());
		System.out.println("Player Two's Final Score: " + player2.getScore());
		if (player1.getScore() > player2.getScore()) {
			// Result if player 1 wins
			System.out.println("Player One wins!");
		} else if (player2.getScore() > player1.getScore()) {
			// Result if player 2 wins
			System.out.println("Player Two wins!");
		} else {
			// Result if tied game
			System.out.println("The game is a draw!");
		}

	}

}

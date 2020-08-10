package GuessCard;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DeckOfCards deck = new DeckOfCards();
		deck.shuffle();
		new GUI();
	}

}

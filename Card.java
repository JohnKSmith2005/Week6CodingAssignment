package week6CodingProject;



//    1. Create the following classes.
//    a. Card


public class Card {
	
	
	// value (contains a value from 2-14 representing cards 2-Ace)
	private int value;
	
	// name (e.g. Ace of Diamonds, or Two of Hearts)
	private String name;
	
	//Card constructor
	
	public Card(int value, String name) {
	this.value = value;
	this.name = name;
	}
	
	
    //ii. Methods
    //1. Getters and Setters
	
	
	public int getValue() {
		return value;
	}
	
	
	public void setValue(int value) {
		this.value = value;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	//describe (prints out information about a card)
	public void describe() {
		System.out.println(name);
	}
	
	//Create a card's name based on position during deck creation loop.
	public static String MakeCardName(int suit, int value) {
		//Array of possible names
		String[] suitArray = { "Diamonds", "Hearts", "Spades", "Clubs" };
		String[] valueArray = { "Two of ", "Three of ", "Four of ", "Five of ", "Six of ", "Seven of ",
				"Eight of ", "Nine of ", "Ten of ", "Jack of ", "Queen of ", "King of ", "Ace of " };
		
		//Set suit and value based on position in loop.
		String stringSuit = suitArray[suit];
		String stringValue = valueArray[value];
		
		//Add suit and value together to create name and return.
		String cardName = stringValue + stringSuit;
		return cardName;
	}

}

package cardgame.models;

/**
 * @author MDevoldere
 * @version 1.0
 * @created 12-juil.-2021 19:07:42
 */
public class Card {

	private int ability;
	private int armor;
	private String name;
	private int power;
	private CardType cardType;

	public Card(String _name){
		this.name = _name;
	}

	public String getName() 
	{
		return this.name;
	}

}
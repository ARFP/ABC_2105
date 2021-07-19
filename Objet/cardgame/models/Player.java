package cardgame.models;

import java.util.ArrayList;
import java.util.Optional;

/**
 * @author MDevoldere
 * @version 1.0
 * @created 12-juil.-2021 19:07:42
 */
public class Player {

	private String username;
	private String email;
	private String firstname;
	private String lastname;
	private ArrayList<Card> cards;

	public Player(String _lastname, String _firstname)
	{
		this.lastname = _lastname;
		this.firstname = _firstname;
		this.username = _firstname.substring(0, 1) + _lastname;
		this.email = this.username + "@arfp.asso.fr";
		this.cards = new ArrayList<Card>();
	}

	public String getUsername()
	{
		return this.username;
	}

	public Card[] getCards()
	{
		return (Card[])this.cards.toArray();
	}

	public Card getCard(String _name)
	{
		Optional<Card> card = this.cards.stream().filter(c -> c.getName().equals(_name)).findFirst();

		return card.orElse(null);
	}

}
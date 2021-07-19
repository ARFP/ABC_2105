package cardgame;

import java.util.ArrayList;

import cardgame.models.*;

public class App 
{
    private static ArrayList<Card> cards;

    public static void main(String[] args) 
    {
        cards = new ArrayList<Card>();

        cards.add(new Card("Joe"));
        cards.add(new Card("Jack"));
        cards.add(new Card("Lea"));
       
        for(Card c : cards) {
            System.out.println(c.getName());
        }
    }
}

package org.example;
import java.util.ArrayList;
public class BataillePlayer
{
    //ATTRIBUTES

    private String name;
    private ArrayList<BatailleCard> deck = new ArrayList<>();
    private int points = 0;

    //CONSTRUCTOR

    public BataillePlayer(String nom)
    {
        this.name = nom;
    }

    //METHODS

    //1 - take card

    public BatailleCard takeCard()
    {
        return this.deck.remove(0);
    }

    //2 - add card to deck

    public void addCard(BatailleCard card)
    {
        this.deck.add(card);
    }

    //3 - add point

    public void incrementPoints()
    {
        this.points = points+1;
    }

    //GETTERS

    public int getPoints()
    {
        return this.points;
    }

    public String getName()
    {
        return this.name;
    }
}

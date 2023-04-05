package org.example;
import java.util.ArrayList;
import java.util.Collections;
public class Main
{
    public static void main(String[]args)
    {
        // Create two players

        BataillePlayer player1 = new BataillePlayer("Axelle");
        BataillePlayer player2 = new BataillePlayer("Maryne");

        //Create deck for the game

        ArrayList<BatailleCard> deck = new ArrayList<>();

        for (int v = 0; v < 13; v++)
        {
            for (int c = 0; c < 4; c++)
            {
                BatailleCard card = new BatailleCard(v, c);

                deck.add(card);
            }
        }

        //Shuffle the deck

        Collections.shuffle(deck);

        //Distribute between the two players

        for (int i = 0; i < 52; i++)
        {
            if (i % 2 == 0)
                player1.addCard(deck.remove(0));
            else
                player2.addCard(deck.remove(0));
        }

        System.out.println("game starting...");

        for (int t = 0; t < 26; t++)
        {
            BatailleCard card1 = player1.takeCard();
            BatailleCard card2 = player2.takeCard();

            int result = card1.compareTo(card2);

            if (result == 1)
                player1.incrementPoints();
            else if (result == -1)
                player2.incrementPoints();

            deck.add(card1);
            deck.add(card2);

            System.out.println(player1.getName()+" has "+player1.getPoints()+" points and "+player2.getName()+" has "+player2.getPoints()+" points.");
        }

        //Determinate the winner, if there is one

        if (player1.getPoints() > player2.getPoints())
            System.out.println(player1.getName()+" wins !");
        else if (player1.getPoints() < player2.getPoints())
            System.out.println(player2.getName()+" wins !");
        else
            System.out.println("It's a draw !");
    }
}
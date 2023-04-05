package org.example;

public class BatailleCard
{
    //ATTRIBUTES

    private static String[]values = {"two", "three", "four", "five", "six", "seven", "eight", "nine","ten","Jack","Queen","King","Ace"};
    private static String[]colors = {"diamonds", "spades", "clubs", "hearts"};

    private int value;
    private int color;

    //CONSTRUCTOR

    public BatailleCard(int val, int col)
    {
        this.value = val;
        this.color = col;
    }

    //METHODS

    public int compareTo(BatailleCard card2)
    {
        if (this.value > card2.value)
            return 1;

        else if (this.value < card2.value)
            return -1;

        else
            return 0;
    }

    public String toString()
    {
        return values[value]+" of "+colors[color];

    }
}

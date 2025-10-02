package com.pluralsight;

public class Dice {
    //roll() returning a random number between 1 and 6
    //is there a random class
    //formula int randomNumber = min + (int)(Math.random() * ((max - min) + 1));

    public int roll(){
        return (int)(Math.random()*(6)+1);
    }
}

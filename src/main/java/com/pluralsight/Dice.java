package com.pluralsight;

public class Dice {
    //roll() returning a random number between 1 and 6
    //is there a random class or do i need to do math.random()
    //formula int randomNumber = min + (int)(Math.random() * ((max - min) + 1));
    //java.util.random = Don't know about this will ask later

    public int roll(){
        return (int)(Math.random()*(6-1)+1);
    }
}

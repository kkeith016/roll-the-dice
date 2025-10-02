package com.pluralsight;

public class RollTheDice {
    public static void main(String[] args) {


        //Lol
        Dice dice = new Dice();

        //Vars to hold the rolls
        int roll1, roll2;

        //dice counter


        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        //Roll the dice 100 times

        for (int i = 1; i <= 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();




        }

    }
}

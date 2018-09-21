package com.example.function;

/**
 * Created by Dmitrii on 21.09.2018.
 */
public class DiceRoller {
    public static int rollDice() {
        int rand = (int) ((Math.random() * 6) + 1);
        return rand;
    }
}

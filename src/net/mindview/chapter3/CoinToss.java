package net.mindview.chapter3;

import java.util.Random;

public class CoinToss {
    static boolean result;
    static int i;

    public static void main(String[] args) {
        Random rand = new Random();
        i = rand.nextInt(100);
        if (i<50) {
            result = false;
        } else {
            result = true;
        }
        System.out.println(result);
    }
}

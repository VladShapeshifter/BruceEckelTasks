package net.mindview.chapter9.toss;

import java.util.Random;

public class CoinToss implements Toss {
    @Override
    public String fling() {
        Random rand = new Random();
        int num = rand.nextInt(2);
        switch (num) {
            default:
            case 1 : return "Orel";
            case 0 : return "Reshka";
        }

    }
}

package net.mindview.chapter9.toss;

import java.util.Random;

public class CoinToss implements Toss {
    private CoinToss() {

    }
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
    public static TossFactory factory = new TossFactory() {
        @Override
        public Toss getToss() {
            return new CoinToss();
        }
    };
}

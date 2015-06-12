package net.mindview.chapter9.toss;

import java.util.Random;

public class DiceToss implements Toss {
    private DiceToss() {

    }
    @Override
    public String fling() {
        Random rand = new Random();
        int num = rand.nextInt(6);
        switch (num) {
            default:
            case 1 : return "1";
            case 2 : return "2";
            case 3 : return "3";
            case 4 : return "4";
            case 5 : return "5";
            case 6 : return "6";
        }
    }
    public static TossFactory factory = new TossFactory() {
        @Override
        public Toss getToss() {
            return new DiceToss();
        }
    };
}

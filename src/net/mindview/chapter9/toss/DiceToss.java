package net.mindview.chapter9.toss;

import java.util.Random;

public class DiceToss implements Toss {

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
}

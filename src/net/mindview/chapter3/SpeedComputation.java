package net.mindview.chapter3;

import java.util.Random;

public class SpeedComputation {
    static double s;
    static int t;
    static double v;
    public static void main(String[] args) {
        Random rand = new Random(99);
        s = rand.nextInt(100) + 1;
        System.out.println(s);
        t = rand.nextInt(100) + 1;
        System.out.println(t);
        v = s/t;
        System.out.println(v);
        System.out.println(Math.rint(v*100)/100);
    }
}

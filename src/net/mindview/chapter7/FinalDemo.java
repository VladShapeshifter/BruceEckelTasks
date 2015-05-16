package net.mindview.chapter7;

import java.util.Random;

public class FinalDemo {
    static Random random = new Random();
    static final int I = random.nextInt();
    final double D = random.nextDouble();

    public static void main(String[] args) {
        FinalDemo finalDemo1 = new FinalDemo();
        FinalDemo finalDemo2 = new FinalDemo();
        System.out.println(finalDemo1.I);
        System.out.println(finalDemo2.I);
        System.out.println(finalDemo1.I);

        System.out.println(finalDemo1.D);
        System.out.println(finalDemo2.D);
        System.out.println(finalDemo1.D);
//        FinalDemo.I = 0;
//        finalDemo1.D = 0;
    }
}

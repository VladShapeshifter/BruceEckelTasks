package net.mindview.chapter3;

import java.util.Random;

public class NumbersRatioInfinity {
    public static void main(String[] args) {
        int prev = 0;
        for (; ; ) {
            Random rand = new Random();
            int r = rand.nextInt(100);
            if (prev < r)
                System.out.println(r + " новое больше старого " + prev);
            else if (prev > r)
                System.out.println(r + " новое меньше старого " + prev);
            else System.out.println(r + " новое равно старому " + prev);
            prev = r;
        }
    }
}

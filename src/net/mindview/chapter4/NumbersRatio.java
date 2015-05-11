package net.mindview.chapter4;

import java.util.Random;

public class NumbersRatio {
    public static void main(String[] args) {
        int prev = 0;
        for (int i = 1; i < 26; i++) {
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

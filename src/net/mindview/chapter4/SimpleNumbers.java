package net.mindview.chapter4;

public class SimpleNumbers {
    public static void main(String[] args) {
        for (double i = 1; i < 100; i++) {
            int check1 = 0;
            int check2 = 0;
            int check3 = 0;
            for (double n = 1; n <= i; n++) {
                if (i%n == 0) {
                    check1++;
                }
                if (i/n == i) {
                    check2++;
                }
                if (i/n == 1) {
                    check3++;
                }
            }
            if (check1 == 2 && check2 == 1 && check3 == 1) {
                System.out.println((int)i);
            }
        }
    }
}

package net.mindview.chapter4;

public class Break {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i == 99) break;
            System.out.println(i);
        }
    }
}

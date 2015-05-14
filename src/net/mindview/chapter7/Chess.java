package net.mindview.chapter7;

public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Constructor Chess");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}

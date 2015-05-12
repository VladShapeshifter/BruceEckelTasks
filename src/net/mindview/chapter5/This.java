package net.mindview.chapter5;

public class This {
    void first() {
        second();
        this.second();
    }
    void second() {
        System.out.println("method calling");
    }

    public static void main(String[] args) {
        This is = new This();
        is.first();
    }
}

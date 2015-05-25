package net.mindview.chapter8.music3;

public class Piano extends Instrument {
    void play(Note n) {
        System.out.println("Piano.play()" + n);
    }
    String what() {
        return "Piano";
    }
    void adjust() {
        System.out.println("Adjusting Piano");
    }
}

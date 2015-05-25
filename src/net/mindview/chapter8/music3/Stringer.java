package net.mindview.chapter8.music3;

class Stringer extends Instrument {
    void play(Note n) {
        System.out.println("Stringer.play()" + n);
    }
    String what() {
        return "Stringer";
    }
    void adjust() {
        System.out.println("Adjusting Stringer");
    }
}

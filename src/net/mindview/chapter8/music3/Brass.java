package net.mindview.chapter8.music3;

class Brass extends Wind {
    void play(Note n) {
        System.out.println("Brass.play()" + n);
    }
    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

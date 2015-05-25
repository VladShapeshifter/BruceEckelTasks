package net.mindview.chapter8.music3;

class Woodwind extends Wind {
    void play(Note n) {
        System.out.println("Woodwind.play()" + n);
    }
    void adjust() {
        System.out.println("Adjusting Woodwind");
    }
}

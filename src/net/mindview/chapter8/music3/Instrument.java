package net.mindview.chapter8.music3;

class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play()" + n);
    }
    String what() {
        return "Instrument";
    }
    void adjust() {
        System.out.println("Adjusting instrument");
    }

    @Override
    public String toString() {
        return what();
    }
}

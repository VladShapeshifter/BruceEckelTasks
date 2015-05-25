package net.mindview.chapter8.music3;

public class Music3 {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
//        System.out.println(i.what());
    }
    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringer(),
                new Brass(),
                new Woodwind(),
                new Piano()
        };
        tuneAll(orchestra);
    }
}

package net.mindview.chapter8.music3;

import java.util.Random;

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
    private static Random rand = new Random();
    public static Instrument next() {
        switch (rand.nextInt(6)) {
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringer();
            case 3: return new Brass();
            case 4: return new Woodwind();
            case 5: return new Piano();
        }
    }



    public static void main(String[] args) {
        /*Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringer(),
                new Brass(),
                new Woodwind(),
                new Piano()
        };
        tuneAll(orchestra);*/
        Instrument[] instr = new Instrument[6];
        for (int i = 0; i < instr.length; i++) {
            instr[i] = next();
        }
        for (Instrument i : instr) {
            i.play(Note.B_FLAT);
        }

    }
}

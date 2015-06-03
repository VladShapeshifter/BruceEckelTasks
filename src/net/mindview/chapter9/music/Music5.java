package net.mindview.chapter9.music;

import net.mindview.chapter8.music3.Note;

public class Music5 {
    static void tune(Playable i) {
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Playable[] e) {
        for (Playable i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Playable[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}

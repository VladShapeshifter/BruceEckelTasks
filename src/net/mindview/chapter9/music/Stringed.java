package net.mindview.chapter9.music;

import net.mindview.chapter8.music3.Note;

public class Stringed extends Instrument implements Playable {
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    void adjust() {
        System.out.println(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "Stringed";
    }
}

package net.mindview.chapter9.music;

import net.mindview.chapter8.music3.Note;

public abstract class Instrument {
    static final int VALUE = 5;
    abstract void play(Note n);
    abstract void adjust();
}

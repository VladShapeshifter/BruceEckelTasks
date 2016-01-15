package net.mindview.chapter15.characters;

public class Character {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return " " + id;
    }
}

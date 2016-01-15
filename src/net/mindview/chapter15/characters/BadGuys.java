package net.mindview.chapter15.characters;

public class BadGuys extends Character {
    @Override
    public String toString() {
        return "Dark side " + getClass().getSimpleName() + " " + super.toString();
    }
}

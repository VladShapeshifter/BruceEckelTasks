package net.mindview.chapter15.characters;

public class GoodGuys extends Character {
    @Override
    public String toString() {
        return "Jedi side " + getClass().getSimpleName() + " " + super.toString();
    }
}

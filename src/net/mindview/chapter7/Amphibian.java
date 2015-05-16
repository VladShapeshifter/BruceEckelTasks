package net.mindview.chapter7;

public class Amphibian {
    void jump() {

    }
    void swim() {

    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibian frog1 = (Amphibian) frog;
        frog1.jump();
        frog1.swim();

    }
}

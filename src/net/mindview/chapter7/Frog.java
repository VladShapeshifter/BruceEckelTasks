package net.mindview.chapter7;

public class Frog extends Amphibian {
    @Override
    void jump() {
        System.out.println("frog's jump");
    }

    @Override
    void swim() {
        System.out.println("frog's swim");
    }
}

package net.mindview.chapter11;

public class Command {
    String s;
    Command(String text) {
        s = text;
    }
    void operation() {
        System.out.println(s);
    }

    @Override
    public String toString() {
        return s;
    }
}

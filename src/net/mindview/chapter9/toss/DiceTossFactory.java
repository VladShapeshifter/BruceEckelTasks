package net.mindview.chapter9.toss;

public class DiceTossFactory implements TossFactory {
    @Override
    public Toss getToss() {
        return new DiceToss();
    }
}

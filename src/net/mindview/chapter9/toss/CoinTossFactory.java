package net.mindview.chapter9.toss;

public class CoinTossFactory implements TossFactory {
    @Override
    public Toss getToss() {
        return new CoinToss();
    }
}

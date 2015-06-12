package net.mindview.chapter9.toss;

public class RandomEvent {
    public static void toss(TossFactory tf) {
        Toss toss = tf.getToss();
        System.out.println(toss.fling());
    }

    public static void main(String[] args) {
        toss(CoinToss.factory);
    }
}

package net.mindview.chapter9.toss;

public class RandomEvent2 extends RandomEvent {
    public static void toss(TossFactory tf) {
        Toss toss = tf.getToss();
        System.out.println(toss.fling() + " " + toss.fling());
    }

    public static void main(String[] args) {
        toss(new DiceTossFactory());
    }
}

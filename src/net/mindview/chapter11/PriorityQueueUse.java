package net.mindview.chapter11;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueUse {
    public static void main(String[] args) {
        PriorityQueue<Double> queue = new PriorityQueue<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            queue.offer(rand.nextDouble());
        }
        Iterator<Double> it = queue.iterator();
        while (it.hasNext()) {

        }
    }
}

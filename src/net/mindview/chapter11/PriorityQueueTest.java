package net.mindview.chapter11;

import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueTest {
    public static void main(String[] args) {
        Random rand = new Random();
        PriorityQueue<Double> queue = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.offer(rand.nextDouble());
        }
        while (queue.peek() != null) {
            System.out.println(queue.poll());
        }
    }

}

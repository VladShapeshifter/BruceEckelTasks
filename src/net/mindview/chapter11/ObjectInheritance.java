package net.mindview.chapter11;

import java.util.PriorityQueue;

public class ObjectInheritance extends Object {
    public static void main(String[] args) {
        PriorityQueue<ObjectInheritance> pq = new PriorityQueue<>();
        pq.offer(new ObjectInheritance());
        pq.offer(new ObjectInheritance());
        pq.offer(new ObjectInheritance());
    }
}

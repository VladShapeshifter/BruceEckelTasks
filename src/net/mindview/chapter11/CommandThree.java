package net.mindview.chapter11;

import java.util.Iterator;
import java.util.Queue;

public class CommandThree {
    void enumeration(Queue<Command> queue) {
        Iterator<Command> it = queue.iterator();
        while(it.hasNext()) {
            it.next().operation();
        }
    }
}

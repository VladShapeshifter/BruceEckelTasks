package net.mindview.chapter11;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CommandTwo {
    Queue<Command> fillCommand(Command[] commands) {
        Queue<Command> queue = new LinkedList<>(Arrays.asList(commands));
        System.out.println(queue);
        return queue;
    }
}

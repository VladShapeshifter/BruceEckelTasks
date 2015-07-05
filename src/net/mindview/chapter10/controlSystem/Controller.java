package net.mindview.chapter10.controlSystem;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Controller {
    private List<Event> eventList = new LinkedList<>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        LinkedList<Event> events = new LinkedList<>(eventList);
        Iterator<Event> it = events.iterator();
        while (it.hasNext()) {
//            if (it.next().ready()) {
                Event e = it.next();
                System.out.println(e);
                e.action();
                it.remove();
//            }
        }

        /*while (eventList.size() > 0) {
            for (Event e : new LinkedList<>(eventList)) {
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }*/
    }
}

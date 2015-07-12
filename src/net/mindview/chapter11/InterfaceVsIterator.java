package net.mindview.chapter11;

import java.util.*;

public class InterfaceVsIterator {
    public static void display(Iterator<Integer> it) {
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println("number: " + i);
        }
        System.out.println();
    }
    public static void display(Collection<Integer> ints) {
        for (Integer i : ints) {
            System.out.println("number: " + i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> intSet = new HashSet<>(intList);
        Map<String, Integer> intMap = new LinkedHashMap<>();
        String[] stringInts = ("One, Two, Three, Four, Five").split(", ");
        for (int i = 0; i < stringInts.length; i++) {
            intMap.put(stringInts[i], intList.get(i));
        }
        display(intList);
        display(intSet);
        display(intList.iterator());
        display(intSet.iterator());
        System.out.println(intMap);
        System.out.println(intMap.keySet());
        display(intMap.values());
        display(intMap.values().iterator());
    }
}

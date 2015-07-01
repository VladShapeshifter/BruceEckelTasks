package net.mindview.chapter11;

import java.util.*;

public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Integer> numb = new ArrayList<>(7);
        numb.add(1);
        numb.add(3);
        numb.add(7);
        numb.add(2);
        numb.add(0);
        numb.add(9);
        numb.add(5);
        System.out.println("1: " + numb);
        int i = 6;
        numb.add(6);
        System.out.println("2: " + numb);
        System.out.println("3: " + numb.contains(i));
        numb.remove(i);
        int y = numb.get(2);
        System.out.println("4: " + y + " " + numb.indexOf(y));
        int j = new Integer(9);
        System.out.println("5: " + numb.indexOf(j));
//        System.out.println("6: " + numb.remove(j));
//        System.out.println("7: " + numb.remove(y));
        System.out.println("8: " + numb);
        numb.add(3, new Integer(4));
        System.out.println("9: " + numb);
        List<Integer> sub = numb.subList(1, 4);
        System.out.println("Sublist is: " + sub);
        System.out.println("10: " + numb.containsAll(sub));
        Collections.sort(sub);
        System.out.println("After sort: " + sub);
        System.out.println("11: " + numb.containsAll(sub));
        Collections.shuffle(sub, rand);
        System.out.println("After shuffle: " + sub);
        System.out.println("12: " + numb.containsAll(sub));
        List<Integer> copy = new ArrayList<>(numb);
        sub = Arrays.asList(numb.get(1), numb.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + sub);
        copy = new ArrayList<>(numb);
        copy.remove(2);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        copy.set(1, new Integer(9));
        System.out.println("16: " + copy);
        copy.addAll(2, sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + numb.isEmpty());
        numb.clear();
        System.out.println("19: " + numb);
        System.out.println("20: " + numb.isEmpty());
        numb.add(1);
        numb.add(2);
        numb.add(3);
        numb.add(4);
        System.out.println("21: " + numb);
        Object[] o = numb.toArray();
        System.out.println("22: " + o[3]);
        Integer[] integers = numb.toArray(new Integer[0]);
//        System.out.println("23: " + integers[3].id()));
    }
}

package net.mindview.chapter11;

import java.util.*;

public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<String> str = new ArrayList<>(7);
        str.add("1");
        str.add("3");
        str.add("7");
        str.add("2");
        str.add("0");
        str.add("9");
        str.add("5");
        System.out.println("1: " + str);
        String s = "6";
        str.add("6");
        System.out.println("2: " + str);
        System.out.println("3: " + str.contains(s));
        str.remove(s);
        String ss = str.get(2);
        System.out.println("4: " + ss + " " + str.indexOf(ss));
        String sss = new String("9");
        System.out.println("5: " + str.indexOf(sss));
        System.out.println("6: " + str.remove(sss));
        System.out.println("7: " + str.remove(ss));
        System.out.println("8: " + str);
        str.add(3, new String("4"));
        System.out.println("9: " + str);
        List<String> sub = str.subList(1, 4);
        System.out.println("Sublist is: " + sub);
        System.out.println("10: " + str.containsAll(sub));
        Collections.sort(sub);
        System.out.println("After sort: " + sub);
        System.out.println("11: " + str.containsAll(sub));
        Collections.shuffle(sub, rand);
        System.out.println("After shuffle: " + sub);
        System.out.println("12: " + str.containsAll(sub));
        List<String> copy = new ArrayList<>(str);
        sub = Arrays.asList(str.get(1), str.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + sub);
        copy = new ArrayList<>(str);
        copy.remove(2);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        copy.set(1, new String("9"));
        System.out.println("16: " + copy);
        copy.addAll(2, sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + str.isEmpty());
        str.clear();
        System.out.println("19: " + str);
        System.out.println("20: " + str.isEmpty());
        str.add("1");
        str.add("2");
        str.add("3");
        str.add("4");
        System.out.println("21: " + str);
        Object[] o = str.toArray();
        System.out.println("22: " + o[3]);
        String[] strings = str.toArray(new String[0]);
//        System.out.println("23: " + integers[3].id()));
    }
}

package net.mindview.chapter11;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Vlad");
        names.add("Ivan");
        names.add("Stepan");
        names.add("Cusma");
        names.add("Mark");
        System.out.println(names);
        TreeSet<String> sortedNames = new TreeSet<>(names);
        System.out.println(sortedNames);
        LinkedHashSet<String> linkedNames = new LinkedHashSet<>(sortedNames);
        System.out.println(linkedNames);
    }
}

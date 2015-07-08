package net.mindview.chapter11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, String> professions = new HashMap<>();
        professions.put("Vlad", "Student");
        professions.put("Ivan", "Worker");
        professions.put("Stepan", "Captain");
        professions.put("Cusma", "Driver");
        professions.put("Mark", "Programmer");
        System.out.println(professions);
        TreeMap<String, String> sortedProfessions = new TreeMap<>(professions);
        System.out.println(sortedProfessions);
        LinkedHashMap<String, String> linkedProfessions = new LinkedHashMap<>(sortedProfessions);
        System.out.println(linkedProfessions);
    }
}

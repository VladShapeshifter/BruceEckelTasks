package net.mindview.chapter11;

import java.util.*;

public class LinkedHashMapSort {
    public static void main(String[] args) {
        Map<String, String> stringMap = new LinkedHashMap<>();
        stringMap.put("Zero", "A");
        stringMap.put("One", "B");
        stringMap.put("Two", "S");
        stringMap.put("Three", "D");
        stringMap.put("Azbuka", "C");
        System.out.println(stringMap);
        Map<String, String> sortedMap = new LinkedHashMap<>();

        Set<Map.Entry<String, String>> entrySet = stringMap.entrySet();
        List<Map.Entry<String, String>> entryList = new ArrayList<>();
        entryList.addAll(entrySet);
        Collections.sort(entryList, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println(entryList);

        Iterator<Map.Entry<String, String>> it = entryList.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            sortedMap.put(next.getKey(), next.getValue());
        }
        System.out.println(sortedMap);
    }
}

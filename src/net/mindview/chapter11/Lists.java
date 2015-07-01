package net.mindview.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        Lists[] l = {
                new Lists(),
                new Lists(),
                new Lists(),
                new Lists()
        };
        List<Lists> listsList = new ArrayList<>(Arrays.asList(l));
        System.out.println(listsList);
        List<Lists> subList = listsList.subList(0, 1);
        System.out.println(subList);
        listsList.removeAll(subList);
        System.out.println(listsList);
    }
}

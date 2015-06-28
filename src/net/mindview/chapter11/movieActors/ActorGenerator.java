package net.mindview.chapter11.movieActors;

import java.util.*;

public class ActorGenerator implements Generator {
    private String[] actorArray = {};
    private List<String> actorList = new ArrayList<>();
    private Set<String> actorSet = new HashSet<>();
    private Set<String> actorSetStd = new HashSet<>();
    Iterator<String> iter = actorSet.iterator();

    ActorGenerator(String[] s) {
        actorArray = s;
    }
    ActorGenerator(List<String> list) {
        actorList = list;
    }
    ActorGenerator(Set<String> set) {
        actorSet = set;
        actorSetStd = set;
    }

    int i = 0;
    Object[] objects = actorSet.toArray();

    @Override
    public String next() {
        String next = "";
        if (i < actorArray.length) {
            next = actorArray[i++];
            if (i == actorArray.length) {
                i = 0;
            }
        }
        else if (i < actorList.size()) {
            next = actorList.get(i++);
            if (i == actorList.size()) {
                i = 0;
            }
        }
        else if (i < objects.length) {
            next = (String)objects[i++];
            if (i == objects.length) {
                i = 0;
            }
        }


        /*else if (iter.hasNext()) {
            next = iter.next();
        } else {
            actorSet = actorSetStd;
        }*/
        return next;
    }

    public static void main(String[] args) {
        String[] actorArray = {"Bruce", "John", "Bred"};
        List<String> arrayList = new ArrayList<>(Arrays.asList("Flex", "Richard", "Steven"));
        Set<String> hashSet = new HashSet<>(arrayList);

        ActorGenerator ag1 = new ActorGenerator(hashSet);
        System.out.println(ag1.next());
        System.out.println(ag1.next());
        System.out.println(ag1.next());
        System.out.println(ag1.next());
        System.out.println(ag1.next());
        System.out.println(ag1.next());
    }
}

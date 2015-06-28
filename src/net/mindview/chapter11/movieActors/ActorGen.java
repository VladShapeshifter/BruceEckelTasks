package net.mindview.chapter11.movieActors;

import java.util.*;

public class ActorGen implements Generator {
    static Random rand = new Random(47);

    @Override
    public String next() {
        switch (rand.nextInt(5)) {
            default:
            case 0 : return "Adam";
            case 1 : return "Smith";
            case 2 : return "Bred";
            case 3 : return "John";
            case 4 : return "Victor";
        }
    }

    public static void main(String[] args) {
        ActorGen gen = new ActorGen();

        /*String[] actorArray = new String[10];
        for (int i = 0; i < actorArray.length; i++) {
            actorArray[i] = gen.next();
        }*/
        String[] actorArray = new String[4];
        actorArray[0] = "Adam";
        actorArray[1] = "Smith";
        actorArray[2] = "Bred";
        actorArray[3] = "Adam";

        /*ArrayList<String> actorArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            actorArrayList.add(i, gen.next());
        }*/
        ArrayList<String> actorArrayList = new ArrayList<>();
        actorArrayList.add(0, "Adam");
        actorArrayList.add(1, "Smith");
        actorArrayList.add(2, "Bred");
        actorArrayList.add(3, "Adam");

        /*LinkedList<String> actorLinkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            actorLinkedList.add(i, gen.next());
        }*/
        LinkedList<String> actorLinkedList = new LinkedList<>();
        actorLinkedList.add(0, "Adam");
        actorLinkedList.add(1, "Smith");
        actorLinkedList.add(2, "Bred");
        actorLinkedList.add(3, "Adam");

        /*HashSet<String> actorHashSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            actorHashSet.add(gen.next());
        }*/
        HashSet<String> actorHashSet = new HashSet<>();
        actorHashSet.add("Adam");
        actorHashSet.add("Smith");
        actorHashSet.add("Bred");
        actorHashSet.add("Adam");

        /*LinkedHashSet<String> actorLinkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < 10; i++) {
            actorLinkedHashSet.add(gen.next());
        }*/
        LinkedHashSet<String> actorLinkedHashSet = new LinkedHashSet<>();
        actorLinkedHashSet.add("Adam");
        actorLinkedHashSet.add("Smith");
        actorLinkedHashSet.add("Bred");
        actorLinkedHashSet.add("Adam");

        /*TreeSet<String> actorTreeSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            actorTreeSet.add(gen.next());
        }*/
        TreeSet<String> actorTreeSet = new TreeSet<>();
        actorTreeSet.add("Adam");
        actorTreeSet.add("Smith");
        actorTreeSet.add("Bred");
        actorTreeSet.add("Adam");

        System.out.println("Simple Array:  " + Arrays.deepToString(actorArray));
        System.out.println("ArrayList:     " + actorArrayList);
        System.out.println("LinkedList:    " + actorLinkedList);
        System.out.println("HashSet:       " + actorHashSet);
        System.out.println("LinkedHashSet: " + actorLinkedHashSet);
        System.out.println("TreeSet:       " + actorTreeSet);
    }
}

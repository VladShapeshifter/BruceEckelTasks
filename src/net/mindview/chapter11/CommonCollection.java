package net.mindview.chapter11;

import java.util.*;

public class CommonCollection {
    void enumeration(Collection c) {
        Iterator it = c.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CommonCollection coll = new CommonCollection();
        Obj[] objects = {new ObjOne(), new ObjTwo(), new ObjThree()};

        ArrayList<Obj> al = new ArrayList<>();
        al.addAll(Arrays.asList(objects));

        LinkedList<Obj> ll = new LinkedList<>(al);

        HashSet<Obj> hs = new HashSet<>(al);

        TreeSet<Obj> ts = new TreeSet<>(hs);

        LinkedHashSet<Obj> lhs = new LinkedHashSet<>(al);

        coll.enumeration(al);
        coll.enumeration(ll);
        coll.enumeration(hs);
        coll.enumeration(ts);
        coll.enumeration(lhs);
    }
}

package net.mindview.chapter14.pets;

public class Gerbil extends Rodent {
    public String name;
    private static int counter;
    private final int gerbilNumber;
    Gerbil(String name) {
        super(name);
        this.name = name;
        gerbilNumber = counter++;
    }
    Gerbil() {
        super();
        gerbilNumber = counter++;
    }
    /*void hop() {
        System.out.println("Gerbil Number is " + gerbilNumber);
    }*/

    /*public static void main(String[] args) {
        *//*ArrayList<Gerbil> gerbils = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil());
        }
        Iterator<Gerbil> it = gerbils.iterator();
        while (it.hasNext()) {
            it.next().hop();
        }*//*

        Gerbil gerbil1 = new Gerbil("Stan");
        Gerbil gerbil2 = new Gerbil("Matt");
        Gerbil gerbil3 = new Gerbil("Bruce");
        Map<String, Gerbil> gerbils = new HashMap<>();
        gerbils.put(gerbil1.name, gerbil1);
        gerbils.put(gerbil2.name, gerbil2);
        gerbils.put(gerbil3.name, gerbil3);
        Iterator<String> it = gerbils.keySet().iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
            gerbils.get(name).hop();
        }
    }*/
}

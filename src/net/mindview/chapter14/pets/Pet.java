package net.mindview.chapter14.pets;

public class Pet extends Individual {
    public Pet() {
        super();
    }
    public Pet(String s) {
        super(s);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
    /*static List<Factory<? extends Pet>> petFactories = new ArrayList<>();
    static {
        petFactories.add(new Cat.Factory());
        petFactories.add(new Cymric.Factory());
        petFactories.add(new EgyptianMau.Factory());
        petFactories.add(new Manx.Factory());
        petFactories.add(new Dog.Factory());
        petFactories.add(new Mutt.Factory());
        petFactories.add(new Pug.Factory());
        petFactories.add(new Rodent.Factory());
        petFactories.add(new Rat.Factory());
        petFactories.add(new Mouse.Factory());
        petFactories.add(new Hamster.Factory());
        petFactories.add(new Gerbil.Factory());
    }
    private static Random rand = new Random(47);
    public static Pet createRandom() {
        int n = rand.nextInt(petFactories.size());
        return petFactories.get(n).create();
    }*/
}

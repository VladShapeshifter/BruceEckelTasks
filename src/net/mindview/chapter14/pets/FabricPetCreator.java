package net.mindview.chapter14.pets;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FabricPetCreator extends PetCreator {

    static List<Factory<? extends Pet>> petFactories = new ArrayList<>();
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

    @Override
    public List<Factory<? extends Pet>> types() {
        return petFactories;
    }

    /*@Override
    public Pet randomPet() {
        int n = rand.nextInt(petFactories.size());
        return petFactories.get(n).create();
    }*/
}

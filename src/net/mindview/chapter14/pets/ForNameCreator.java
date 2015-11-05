/*
package net.mindview.chapter14.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<>();
    private static String[] typeNames = {
            "net.mindview.chapter14.pets.Mutt",
            "net.mindview.chapter14.pets.Pug",
            "net.mindview.chapter14.pets.EgyptianMau",
            "net.mindview.chapter14.pets.Manx",
            "net.mindview.chapter14.pets.Cymric",
            "net.mindview.chapter14.pets.Rat",
            "net.mindview.chapter14.pets.Mouse",
            "net.mindview.chapter14.pets.Hamster",
            "net.mindview.chapter14.pets.Gerbil"
    };
    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames) {
                types.add((Class<? extends Pet>)Class.forName(name));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    static {
        loader();
    }
    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
*/

package net.mindview.chapter14.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Part {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
    static List<Class<? extends Part>> partFactories = new ArrayList<>();
    static {
        partFactories.add(FuelFilter.class);
        partFactories.add(AirFilter.class);
        partFactories.add(CabinAirFilter.class);
        partFactories.add(OilFilter.class);
        partFactories.add(FanBelt.class);
        partFactories.add(PowerSteeringBelt.class);
        partFactories.add(GeneratorBelt.class);
    }
    private static Random rand = new Random();
    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        try {
            return partFactories.get(n).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    public static class NullPart extends Part implements Null {
        NullPart() {}
        public String toString() {
            return "NullPart";
        }
    }
    public static final Part NULL = new NullPart();
    public static void addNewPart(Part part) {
        if (part == null) {
            part = Part.NULL;
        }
        partFactories.add(part.getClass());
    }
}

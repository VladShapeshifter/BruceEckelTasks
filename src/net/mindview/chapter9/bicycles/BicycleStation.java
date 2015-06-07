package net.mindview.chapter9.bicycles;

public class BicycleStation {
    public static void takeBike(CycleFactory cf) {
        Cycle cycle = cf.getBike();
        cycle.move();
    }

    public static void main(String[] args) {
        takeBike(new UnicycleFactory());
        takeBike(new BicycleFactory());
        takeBike(new TricycleFactory());
    }
}

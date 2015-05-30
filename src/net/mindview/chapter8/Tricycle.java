package net.mindview.chapter8;

public class Tricycle extends Cycle {
    Tricycle() {
        info = "Tricycle object";
        wheelsCount = 3;
    }

    public static void main(String[] args) {
//        Tricycle tricycle = new Tricycle();
//        tricycle.ride(tricycle);
        Unicycle uc = new Unicycle();
        Bicycle bc = new Bicycle();
        Tricycle tc = new Tricycle();
        Cycle[] cycles = new Cycle[3];
        cycles[0] = uc;
        cycles[1] = bc;
        cycles[2] = tc;
        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
//        ((Tricycle)cycles[2]).balance();
    }
}

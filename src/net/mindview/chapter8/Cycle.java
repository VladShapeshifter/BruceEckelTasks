package net.mindview.chapter8;

public class Cycle {
    protected int wheelsCount;
    protected String info;
    public void ride(Cycle cycle) {
        System.out.println(info);
        System.out.println(wheels(cycle));
    }
    private int wheels(Cycle s) {
        switch (s.wheelsCount) {
            default:
            case 1: return 1;
            case 2: return 2;
            case 3: return 3;

        }
    }
}

package net.mindview.chapter13;

class WaterSource {
    private String s;
    WaterSource() {
        System.out.println("WaterSource()");
        s = "constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

package net.mindview.chapter14.shapes;

abstract class Shape {
    boolean hasAngles;
    void draw() {
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
}

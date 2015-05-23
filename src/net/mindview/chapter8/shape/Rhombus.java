package net.mindview.chapter8.shape;

public class Rhombus extends Shape {
    @Override
    public void draw() {
        System.out.println("Rhombus.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Rhombus.erase()");
    }
    @Override
    public void paint() {
        System.out.println("Rhombus.paint()");
    }
}

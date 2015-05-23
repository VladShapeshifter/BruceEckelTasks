package net.mindview.chapter8.shape;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Suare.erase()");
    }
    @Override
    public void paint() {
        System.out.println("Suare.paint()");
    }
}

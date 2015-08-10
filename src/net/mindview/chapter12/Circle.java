package net.mindview.chapter12;

public class Circle extends Shape {
    Circle(int i) {
        super(i);
        System.out.println("Draw a Circle");
    }
    @Override
    void dispose() {
        System.out.println("Erase Circle");
        super.dispose();
    }
}

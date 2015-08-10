package net.mindview.chapter12;

class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        System.out.println("Draw Triangle");
    }
    @Override
    void dispose() {
        System.out.println("Erase Triangle");
        super.dispose();
    }
}

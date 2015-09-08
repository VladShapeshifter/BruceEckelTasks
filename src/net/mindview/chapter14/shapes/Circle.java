package net.mindview.chapter14.shapes;

class Circle extends Shape {
    Circle() {
        hasAngles = false;
    }
    @Override
    public String toString() {
        return "Circle has angles - " + hasAngles;
    }
}

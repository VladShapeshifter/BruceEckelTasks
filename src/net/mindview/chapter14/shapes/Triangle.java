package net.mindview.chapter14.shapes;

class Triangle extends Shape {
    Triangle() {
        hasAngles = true;
    }
    @Override
    public String toString() {
        return "Triangle has angles - " + hasAngles;
    }
}

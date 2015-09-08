package net.mindview.chapter14.shapes;

class Rhomboid extends Shape {
    Rhomboid() {
        hasAngles = true;
    }
    @Override
    public String toString() {
        return "Rhomboid has angles - " + hasAngles;
    }
}

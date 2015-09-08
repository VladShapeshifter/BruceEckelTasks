package net.mindview.chapter14.shapes;

class Square extends Shape {
    Square() {
        hasAngles = true;
    }
    @Override
    public String toString() {
        return "Square has angles - " + hasAngles;
    }
}

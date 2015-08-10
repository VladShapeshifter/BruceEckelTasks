package net.mindview.chapter12;

class Line extends Shape {
    private int start, end;
    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Draw Line: " + start + ", " + end);
    }
    @Override
    void dispose() {
        System.out.println("Erase Line: " + start + ", " + end);
        super.dispose();
    }
}

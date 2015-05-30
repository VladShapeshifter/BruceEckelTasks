package net.mindview.chapter8.polyConstructors;

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }
    Glyph() {
        System.out.println("Glyph() before draw() invocation");
        draw();
        System.out.println("Glyph() after draw() invocation");
        paint();
    }
    final void paint() {
        System.out.println("Glyph.paint()");
    }
}

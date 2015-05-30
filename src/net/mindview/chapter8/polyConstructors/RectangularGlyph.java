package net.mindview.chapter8.polyConstructors;

public class RectangularGlyph extends RoundGlyph {
    RectangularGlyph(int r) {
        super(r);
        System.out.println("RectangularGlyph.RectangularGlyph(), radius = " + r);
    }

    void draw() {
        System.out.println("RectangularGlyph.draw()");
    }
}

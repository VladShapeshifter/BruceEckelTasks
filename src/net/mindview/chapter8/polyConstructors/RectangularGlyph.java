package net.mindview.chapter8.polyConstructors;

class RectangularGlyph extends RoundGlyph {
    RectangularGlyph(int r) {
        super(r);
        draw();
        radius = r;
        System.out.println("RectangularGlyph.RectangularGlyph(), radius = " + radius);
    }

    void draw() {
        System.out.println("RectangularGlyph.draw(), radius = " + radius);
    }
}

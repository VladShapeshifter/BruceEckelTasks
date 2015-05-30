package net.mindview.chapter8.polyConstructors;

class RoundGlyph extends Glyph {
    int radius = 1;
    RoundGlyph(int r) {
//        draw();
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

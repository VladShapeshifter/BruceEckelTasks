package net.mindview.chapter8.shape;

public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator(4);

    public static void main(String[] args) {
        /*Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for (Shape shp : s) {
            shp.paint();
        }*/
        for (Shape sh : gen) {
            sh.paint();
        }

    }
}

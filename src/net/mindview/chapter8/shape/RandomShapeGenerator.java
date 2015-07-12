package net.mindview.chapter8.shape;

import java.util.Iterator;
import java.util.Random;

public class RandomShapeGenerator implements Iterable<Shape> {
    private Random rand = new Random();

    /*public Shape next() {
        switch (rand.nextInt(4)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            case 3:
                return new Rhombus();
        }
    }*/

    private int shapeCount;

    RandomShapeGenerator(int i) {
        shapeCount = i;
    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < shapeCount;
            }

            @Override
            public Shape next() {
                index++;
                switch (rand.nextInt(4)) {
                    default:
                    case 0:
                        return new Circle();
                    case 1:
                        return new Square();
                    case 2:
                        return new Triangle();
                    case 3:
                        return new Rhombus();
                }
            }
        };
    }
}

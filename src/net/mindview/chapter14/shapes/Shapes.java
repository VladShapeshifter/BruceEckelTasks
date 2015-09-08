package net.mindview.chapter14.shapes;

import java.util.Arrays;
import java.util.List;

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
        Shapes shapes = new Shapes();
        for (Shape shape : shapeList) {
//            shape.draw();
//            shapes.rotate(shape);
            if (shape.hasAngles == true) {
                System.out.println(shape);
            }
        }

        /*Rhomboid rhomboid = new Rhomboid();
        Shape rhomboidAsShape = (Shape) rhomboid;
        Rhomboid rhomboid2 = (Rhomboid) rhomboidAsShape;
        Shape rhomboidAsShape1 = (Shape) rhomboidAsShape;
        System.out.println(rhomboid);
        System.out.println(rhomboidAsShape);
        System.out.println(rhomboid2);
        System.out.println(rhomboid2 instanceof Shape);
        System.out.println(rhomboidAsShape1);*/


    }
    void rotate(Shape shape) {
        if (!(shape instanceof Circle)) {
            System.out.println("Rotate " + shape.getClass().getSimpleName());
        }
    }
}

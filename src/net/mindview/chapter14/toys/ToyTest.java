package net.mindview.chapter14.toys;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
        System.out.println();
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("net.mindview.chapter14.toys.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        for (Constructor constructor : up.getDeclaredConstructors()) {
            try {
                obj = constructor.newInstance(1);
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        /*try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Can't create instance");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Access denied");
            System.exit(1);
        }*/
        printInfo(obj.getClass());
    }
}

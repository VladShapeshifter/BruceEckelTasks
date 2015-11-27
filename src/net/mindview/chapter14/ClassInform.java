package net.mindview.chapter14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassInform {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName(args[0]);

            System.out.println("Class name: " + c.getCanonicalName());

            System.out.println("This class is interface? -" + c.isInterface());

            int modifiers = c.getModifiers();
            System.out.print("This class has modifier: ");
            if (Modifier.isPrivate(modifiers))
                System.out.print("private");
            if (Modifier.isProtected(modifiers))
                System.out.print("protected");
            if (Modifier.isPublic(modifiers))
                System.out.print("public");
            System.out.println();

            System.out.println("This class is abstract? -" + Modifier.isAbstract(modifiers));
            System.out.println("This class is static? -" + Modifier.isStatic(modifiers));
            System.out.println("This class is synchronised? -" + Modifier.isSynchronized(modifiers));
            System.out.println();

            System.out.print("This class realised such interfaces: ");
            for (Class<?> aClass : c.getInterfaces()) {
                System.out.print(aClass.getSimpleName() + " ");
            }
            System.out.println();

            System.out.println("This class extended from super class: " + c.getSuperclass().getSimpleName());

            System.out.println("This class is local class? -" + c.isLocalClass());
            System.out.println("This class is anonymous class? -" + c.isAnonymousClass());

            System.out.print("Class has such constructors: ");
            for (Constructor<?> constructor : c.getDeclaredConstructors()) {
                for (Class<?> aClass : constructor.getParameterTypes()) {
                    System.out.print(constructor.getName() + " (" + aClass.getSimpleName() + " paramName)");
                }
            }
            System.out.println();

            System.out.print("Class has such methods: ");
            for (Method method : c.getDeclaredMethods()) {
                for (Class<?> aClass : method.getParameterTypes()) {
                    System.out.print(method.getReturnType() + " " + method.getName() + " (" + aClass.getSimpleName() + " paramName)");
                }

            }
            System.out.println();

            System.out.print("Class has such fields: ");
            for (Field field : c.getDeclaredFields()) {
                System.out.print(field.getName() + " ");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Sorry. This class was not found.");
        }
    }
}

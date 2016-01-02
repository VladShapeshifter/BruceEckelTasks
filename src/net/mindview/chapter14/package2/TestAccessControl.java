package net.mindview.chapter14.package2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class TestAccessControl {
    public static void main(String[] args) {
        try {
            Class<?> accessControl = Class.forName("net.mindview.chapter14.package1.AccessControl");
            Constructor<?> declaredConstructor = accessControl.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            Object o = declaredConstructor.newInstance();
            System.out.println(o);
            Method[] declaredMethods = accessControl.getDeclaredMethods();
            for (Method method : declaredMethods) {
                method.setAccessible(true);
                method.invoke(o);
            }
        } catch (ClassNotFoundException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}

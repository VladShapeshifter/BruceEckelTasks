package net.mindview.chapter14;

import java.util.Arrays;

public class ClassHierarchyViewer {
    static void hierarchy(Object obj) {
        if (!obj.equals(new Object())) {
            System.out.println(obj.getClass().getSimpleName());
            System.out.println(Arrays.asList(obj.getClass().getDeclaredFields()));
                try {
                    if (obj.getClass().getSuperclass().newInstance() == null) {
                        System.out.println("The reference is Null");
                    } else {
                        hierarchy(obj.getClass().getSuperclass().newInstance());
                    }
                } catch (NullPointerException e) {

                } catch (InstantiationException e) {
                    System.out.println("Can't create instance");
                } catch (IllegalAccessException e) {
                    System.out.println("Access denied");
            }
        }
    }

    public static void main(String[] args) {
        Poem poem = new Poem();
        hierarchy(poem);
    }
}

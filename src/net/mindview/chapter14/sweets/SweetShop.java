package net.mindview.chapter14.sweets;

public class SweetShop {
    public static void main(String[] args) {
//        System.out.println("In main() method");
//        new Candy();
//        System.out.println("After creation of Candy object");
        /*try {
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find Gum");
        }*/
//        System.out.println("After invoking Class.forName(\"Gum\")");
//        new Cookie();
//        System.out.println("After creation of Cookie object");
        System.out.println("In main() method");
        for (int i = 0; i < args.length; i++) {
            try {
                Class.forName(args[i]).newInstance();
            } catch (ClassNotFoundException e) {
                System.out.println("Can't find " + args[i]);
            } catch (InstantiationException e) {
                System.out.println("Can't create instance");
            } catch (IllegalAccessException e) {
                System.out.println("Access denied");
            }
            try {
                System.out.println("After creation of " + Class.forName(args[i]).getSimpleName() + " object");
            } catch (ClassNotFoundException e) {
                System.out.println("Can't find " + args[i]);
            }
        }
    }
}

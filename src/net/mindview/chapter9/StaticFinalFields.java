package net.mindview.chapter9;

public class StaticFinalFields implements InterfaceFields {
    public static void main(String[] args) {
        StaticFinalFields class1 = new StaticFinalFields();
        StaticFinalFields class2 = new StaticFinalFields();
//        class1.STRENGHT = 12;
//        StaticFinalFields.STRENGHT = 12;
        System.out.println(class1.STRENGHT);
        System.out.println(class2.STRENGHT);
    }
}

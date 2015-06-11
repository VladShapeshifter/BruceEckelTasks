package net.mindview.chapter10;

public class ClassInnerClass2 {
    public static void main(String[] args) {
        ClassInnerClass classInnerClass = new ClassInnerClass();
//        ClassInnerClass.Inner2 inner2 = classInnerClass.new Inner2();
        ClassInnerClass.Inner3 inner3 = classInnerClass.new Inner3();
        InterfaceInnerClass interfaceInnerClass = classInnerClass.new Inner3();
//        ClassInnerClass.Inner3 inner31 = (ClassInnerClass.Inner2)interfaceInnerClass;
    }
}

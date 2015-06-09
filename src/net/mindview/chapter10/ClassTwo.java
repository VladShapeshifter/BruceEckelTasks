package net.mindview.chapter10;

public class ClassTwo {


    public static void main(String[] args) {
        ClassOne cl1 = new ClassOne();
        ClassOne.InnerClassOne icl1 = cl1.new InnerClassOne();
    }
}

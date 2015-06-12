package net.mindview.chapter10;

public class NestedClass2Impl implements NestedInterface2 {
    @Override
    public String method2() {
        return "NestedInterface2 implemented method2";
    }

    @Override
    public String method3() {
        return "NestedInterface2 implemented method3";
    }

    public static void main(String[] args) {
        NestedInterface2.InnerClass.method1(new NestedClass2Impl());
    }
}

package net.mindview.chapter7;

public class EmptyConstant {
    final FinalDemo finalDemo;
    EmptyConstant() {
        finalDemo = new FinalDemo();
        System.out.println("FinalDemo class have been initialized and assigned to finalDemo link.");
    }

    public static void main(String[] args) {
        EmptyConstant ec = new EmptyConstant();
//        ec.finalDemo = new FinalDemo();
    }
}

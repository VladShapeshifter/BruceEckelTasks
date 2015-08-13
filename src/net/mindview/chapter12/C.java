package net.mindview.chapter12;

public class C extends B {
    @Override
    void methodA() throws BigException {
        System.out.println("methodA() class C");
        throw new BigException();
    }

    public static void main(String[] args) {
        A aClass = new C();
        try {
            aClass.methodA();
        } catch (SmallException e) {
            e.printStackTrace();
        }
    }
}

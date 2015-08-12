package net.mindview.chapter12;

public class FailingConstructor {
    FailingConstructorDispose fcd;
    FailingConstructorDispose fcd2;
    FailingConstructor() throws MyException {
        fcd = new FailingConstructorDispose();
        fcd.dispose();
        fcd2 = new FailingConstructorDispose();
    }
    void dispose() {
        System.out.println("FailingConstructor was disposed");
    }

    public static void main(String[] args) {
        try {
            FailingConstructor fc = new FailingConstructor();
            try {

            } finally {
                fc.fcd2.dispose();
                fc.dispose();
            }
        } catch (MyException e) {
            e.showMessege();
        }
    }
}

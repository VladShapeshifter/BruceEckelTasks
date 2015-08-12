package net.mindview.chapter12;

public class FailingConstructor {
    FailingConstructorDispose fcd;
    FailingConstructorDispose fcd2;
    FailingConstructor() throws MyException {
        fcd = new FailingConstructorDispose();
        fcd.dispose();
        fcd2 = new FailingConstructorDispose();
    }

    public static void main(String[] args) {
        try {
            FailingConstructor fc = new FailingConstructor();
            try {

            } finally {
                fc.fcd2.dispose();
            }
        } catch (MyException e) {
            e.showMessege();
        }
    }
}

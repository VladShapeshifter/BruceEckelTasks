package net.mindview.chapter12;

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                try {
                    lm.f();
                } finally {
                    lm.dispose();
                }
            } finally {
                throw new RuntimeException("Another exception");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

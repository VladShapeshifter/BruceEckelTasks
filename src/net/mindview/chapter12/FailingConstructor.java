package net.mindview.chapter12;

public class FailingConstructor {
    FailingConstructor() throws Exception {

    }
    private void dispose() {

    }

    public static void main(String[] args) {
        try {
            FailingConstructor fc = new FailingConstructor();
            try {

            } finally {
                fc.dispose();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

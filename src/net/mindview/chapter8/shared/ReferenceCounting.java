package net.mindview.chapter8.shared;

public class ReferenceCounting {
    public static void main(String[] args) throws Throwable {
        Shared shared = new Shared(true);
        Composing[] composing = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared)
        };
//        Shared shared1 = new Shared(false);
//        composing[1] = new Composing(shared1);
        for (Composing c : composing) {
//            finalize(composing);
            c.dispose();

        }
    }

    /*public static void finalize(Composing[] composings) throws Throwable {
        for (int i = 0; i < composings.length; i++) {
            if (composings[i] != null) {
                System.out.println("Object is ready to clean memory.");
            }
        }
    }*/
}

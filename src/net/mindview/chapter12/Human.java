package net.mindview.chapter12;

public class Human {
    public static void main(String[] args) {
        /*try {
            throw new Sneeze();
        } catch (Sneeze e) {
            System.out.println("Sneeze caught");
        } catch (Annoyance e) {
            System.out.println("Annoyance caught");
        }

        try {
            throw new Sneeze();
        } catch (Annoyance e) {
            System.out.println("Annoyance caught");
        }*/

        try {
            throw new Sneeze();
        } catch (RuntimeException e) {
            try {
                throw e.getCause();
            } catch (Throwable throwable) {
//                throwable.printStackTrace();
                System.out.println("Throwable: " + throwable);
            }
        }
    }
}

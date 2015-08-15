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
        WrapCheckedException wce = new WrapCheckedException();
        for (int i = 0; i < 3; i++) {
            try {
                wce.throwRuntimeException(i);
            } catch (RuntimeException re) {
                try {
                    throw re.getCause();
                } catch (Sneeze e) {
                    System.out.println("Sneeze exception: " + e);
                } catch (Annoyance e) {
                    System.out.println("Annoyance exception: " + e);
                } catch (Throwable e) {
                    System.out.println("Throwable exception: " + e);
                }
            }
        }
        /*try {
            throw new Sneeze();
        } catch (RuntimeException e) {
            try {
                throw e.getCause();
            } catch (Throwable throwable) {
//                throwable.printStackTrace();
                System.out.println("Throwable: " + throwable);
            }
        }*/
    }
}

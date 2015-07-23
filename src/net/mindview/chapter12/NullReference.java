package net.mindview.chapter12;

public class NullReference {
    //More hard exception invoke
    void exceptionTestMethod(SimpleObj so) throws Exception {
        if (so == null) {
            throw new Exception();
        } else {
            so.simpleMeth();
        }
    }

    public static void main(String[] args) {
        //More hard exception invoke
        NullReference nr = new NullReference();
        SimpleObj so = null;
        try {
            nr.exceptionTestMethod(so);
        } catch (Exception e) {
            System.out.println("SimpleObj reference to the object is null");
        }

        //Simple exception invoke
        /*SimpleObj so = null;
        try {
            so.simpleMeth();
        } catch (NullPointerException npe) {
            System.out.println(npe);
            npe.printStackTrace();
        } catch (Exception e) {
            System.out.println("SimpleObj reference to the object is null");
        }*/
    }
}

package net.mindview.chapter12;

public class MyExn1 extends Exception {
    /*private static Logger logger = Logger.getLogger("MyExn1");
    MyExn1() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }*/
    @Override
    public String getMessage() {
        return "MyException 1 own message";
    }
}

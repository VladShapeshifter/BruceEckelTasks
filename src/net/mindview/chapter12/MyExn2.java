package net.mindview.chapter12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class MyExn2 extends Exception {
    private static Logger logger = Logger.getLogger("MyExn2");
    MyExn2() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    @Override
    public String getMessage() {
        return "MyException 2 own message";
    }
}

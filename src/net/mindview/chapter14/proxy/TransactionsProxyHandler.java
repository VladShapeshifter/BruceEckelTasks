package net.mindview.chapter14.proxy;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class TransactionsProxyHandler implements InvocationHandler {
    private Object proxied;

    public TransactionsProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        FileWriter writerC = null;
        FileWriter writerF = null;
        try {
            writerC = new FileWriter("C:\\Workspace\\BruceEckelTasks\\src\\net\\mindview\\chapter14\\proxy\\CompletedOperations.txt");
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("File \'CompletedOperations\' was not found");
        }
        try {
            writerF = new FileWriter("C:\\Workspace\\BruceEckelTasks\\src\\net\\mindview\\chapter14\\proxy\\FailuredOperations.txt");
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("File \'FailuredOperations\' was not found");
        }

        try {
            if (args.length > 0) {
                for (Object arg : args) {
                    if (writerC != null) {
                        writerC.write("[" + new Date(System.currentTimeMillis()) + "] " + arg.toString() + " : Transaction complete\n");
                        writerC.close();
                    } else {
                        System.out.println("Writer is not initialised.");
                    }
                }
            } else {
                /*if (writerF != null) {
                    try {
                        writerF.write("[" + new Date(System.currentTimeMillis()) + "] : Transaction failured \n");
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                } else {
                    System.out.println("Writer is not initialised.");
                }*/
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            if (writerF != null) {
                try {
                    writerF.write("[" + new Date(System.currentTimeMillis()) + "] : Transaction failured \n");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } else {
                System.out.println("Writer is not initialised.");
            }
        }
        return method.invoke(proxied, args);
    }
}

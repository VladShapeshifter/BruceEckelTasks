package net.mindview.chapter12;

import java.io.FileInputStream;
import java.io.IOException;

public class MainException {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("MainException2.java");
        file.close();
    }
}

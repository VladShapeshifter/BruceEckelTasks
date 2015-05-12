package net.mindview.chapter6.securedData.anotherFolder;

public class ProtectedData {
    private static String data1 = "secured data";
    private static double data2 = 3.14;
    protected static String accessToPrivateData1() {
        return data1;
    }
    protected static double accessToPrivateData2() {
        return data2;
    }
}

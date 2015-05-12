package net.mindview.chapter6.securedData;

import chapter6.securedData.anotherFolder.ProtectedData;

public class DataAccess extends ProtectedData {
    static String data3;
    static double data4;
    /*static void accessToProtedtedData() {
        ProtectedData pd = new ProtectedData();
        data3 = pd.data1;
        data4 = pd.data2;
    }*/

    public static void main(String[] args) {
        System.out.println(data3 + " " + data4);
//        DataAccess.accessToProtedtedData();
        data3 = accessToPrivateData1();
        data4 = accessToPrivateData2();
        System.out.println(data3 + " " + data4);
    }

}

package net.mindview.chapter6.connection;

public class ConnectionManager {
    static Connection[] connectionsStorage = new Connection[5];
    public ConnectionManager() {
        connectionsStorage[0] = Connection.makeConnection();
        connectionsStorage[1] = Connection.makeConnection();
        connectionsStorage[2] = Connection.makeConnection();
        connectionsStorage[3] = Connection.makeConnection();
//        connectionsStorage[4] = Connection.makeConnection();
    }
    static int i = 0;
    static Connection connection;
    public static Connection giveObject() {
        while (i < connectionsStorage.length) {
            connection = connectionsStorage[i++];
            System.out.println(connection);
        }
        return connection;
    }

    public static void main(String[] args) {
        ConnectionManager cm = new ConnectionManager();
        cm.giveObject();
    }
}

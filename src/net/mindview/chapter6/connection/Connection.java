package net.mindview.chapter6.connection;

class Connection {
    private Connection() {

    }
    static Connection makeConnection() {
        return new Connection();
    }

    @Override
    public String toString() {
        return "This is new object Connection!";
    }
}

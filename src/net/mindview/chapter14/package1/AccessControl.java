package net.mindview.chapter14.package1;

class AccessControl {
    void methodPack() {
        System.out.println("AccessControl package");
    }
    protected void methodProt() {
        System.out.println("AccessControl protected");
    }
    private void methodPriv() {
        System.out.println("AccessControl private");
    }

    @Override
    public String toString() {
        return "AccessControl class";
    }
}

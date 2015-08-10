package net.mindview.chapter12;

class Description {
    private String s;
    Description(String s) {
        this.s = s;
        System.out.println("Create Description " + s);
    }
    protected void dispose() {
        System.out.println("End Description " + s);
    }
}

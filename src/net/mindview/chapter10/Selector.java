package net.mindview.chapter10;

interface Selector {
    boolean end();
    Object current();
    void next();
}

package net.mindview.chapter10;

interface Selector<T> {
    boolean end();
    T current();
    void next();
}

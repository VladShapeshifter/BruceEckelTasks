package net.mindview.chapter9;

import net.mindview.chapter9.interfaces.WhatToDo;

public class ToDoRealisation implements WhatToDo {
    @Override
    public void todoOne() {
        System.out.println("What to do 1");
    }

    @Override
    public void todoTwo() {
        System.out.println("What to do 2");
    }

    @Override
    public void todoThree() {
        System.out.println("What to do 3");
    }

    public static void main(String[] args) {
        ToDoRealisation td = new ToDoRealisation();
        td.todoOne();
        td.todoTwo();
        td.todoThree();
        WhatToDo wtd = new ToDoRealisation();
        wtd.todoOne();
        wtd.todoTwo();
        wtd.todoThree();
    }
}

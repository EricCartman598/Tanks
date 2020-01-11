package com.mygdx.tanks.common;

public class Main {


    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        ChildClass child = new ChildClass();
        ParentClass polymorph = new ChildClass();

        parent.parentMethod();

        child.childMethod();
        child.parentMethod();

        polymorph.parentMethod();
        ((ChildClass) polymorph).childMethod();
        System.out.println(child.field);

        System.out.println(polymorph.field);
    }
}

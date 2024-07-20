package com.Inheritance;

public class Inheritance {}
class Child extends Inheritance{}
class Schild extends Child{}

class Family{
    public static void main(String[] args) {
        Inheritance inheritance = new Inheritance();
        Child child = new Child();
        Schild schild = new Schild();

        System.out.println(inheritance instanceof Object);
        System.out.println(child instanceof Object);
        System.out.println(schild instanceof Object);

        System.out.println(schild instanceof Child);
        System.out.println(child instanceof Inheritance);

    }
}

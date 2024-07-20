package com.Inheritance;

public class Inheritance5 {
    Inheritance5(){
        System.out.println("I5 constructor");
    }
}
class Puffy extends Inheritance5{
    Puffy(){
        this(23);
        System.out.println("Puffy Classy Method");
    }
    Puffy(int age){
        super();
        System.out.println("Puffy age "+age);
    }

    public static void main(String[] args) {
        new Puffy(24);
        new Puffy();
    }
}

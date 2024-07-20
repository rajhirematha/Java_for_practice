package com.oops.Polymorphism;

public class ConstructorOverloading {
    ConstructorOverloading(){
        System.out.println("o - Argument cons.");
    }
}
class COverloading extends ConstructorOverloading{
    COverloading(char e){
        super();
        System.out.println("1 argument cons.");
    }

    public static void main(String[] args) {
        new COverloading('f');
    }
}

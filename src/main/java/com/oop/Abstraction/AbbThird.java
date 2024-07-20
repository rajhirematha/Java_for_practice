package com.oop.Abstraction;

abstract public class AbbThird {
    int age;
    AbbThird(int g) {
        System.out.println("Constructor");
    }
    abstract void abs();

    void abThird(int age) {
        this.age = age;
        System.out.println("abThird method");
    }

}
class AbThirdChild extends AbbThird{
    AbThirdChild(int g) {
        super(g);
    }

    void abs(){
        System.out.println("ABS method");
    }
}
class Main {
    public static void main(String[] args) {
        AbThirdChild a = new AbThirdChild(9);
        a.abThird(1);
        a.abs();
    }
}

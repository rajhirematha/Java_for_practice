package com.Inheritance;

public class Inheritance3 {
    int age=2;

    void i3() {
        System.out.println("I3 method");
    }
}
class Dog extends Inheritance3{
    int age=3;
    void dog(int age){
        System.out.println(super.age);
        System.out.println(this.age);
        System.out.println("Child dog "+age);

    }
}
class I3{
    public static void main(String[] args) {
        new Dog().dog(25);

    }
}
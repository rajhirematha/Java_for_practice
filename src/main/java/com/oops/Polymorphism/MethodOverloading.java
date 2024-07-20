package com.oops.Polymorphism;

public class MethodOverloading {
    void m1() {
        System.out.println("M1 Method");
    }
}
class Child extends MethodOverloading {
    void m1(int a) {
        System.out.println("M2 method");
    }

    void m1(char c) {
        m1(2);
        super.m1();
        System.out.println("M2 child Method");
    }

    public static void main(String[] args) {
        new Child().m1('r');
    }
}




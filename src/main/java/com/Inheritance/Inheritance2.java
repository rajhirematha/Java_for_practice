package com.Inheritance;

// Multi level inheritance
public class Inheritance2 {
    void m1() {
        System.out.println("M1 Method");
    }
}

class Child1 extends Inheritance2 {
    void m2() {
        System.out.println("M2 Method");
    }
}
class Child2 extends Inheritance2{
    void m3(){
        System.out.println("M3 Method");
    }
}

class Main1 {
    public static void main(String[] args) {
    Child2 child2 = new Child2();
    child2.m3();
    child2.m1();

    }
}

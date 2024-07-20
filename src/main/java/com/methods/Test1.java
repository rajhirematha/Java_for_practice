package com.methods;

class X{}
class Emp{}
class Y{}
class Std{}

public class Test1 {
    void m1(X x, Emp emp){
        System.out.println("m1 methods");
    }

    static void m2(Y y, Std std){
        System.out.println("m2 methods");
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.m1(new X(),new Emp());

        Test1.m2(new Y(),new Std());
    }
}

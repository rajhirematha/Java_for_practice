package com.oop.Abstraction;

abstract class AbbSecond {
    abstract void m1();

    abstract void m2();

    abstract void m3();

    void m4() {
        System.out.println("M4 method");
    }
}


abstract class AbbSecChild1 extends AbbSecond {


    void m1() {
        System.out.println("M1 method");
    }
}

abstract class AbChild2 extends AbbSecChild1 {
    void m2() {
        System.out.println("M2 method");
    }
}

abstract class AbChild3 extends AbChild2 {
    void m3() {
        System.out.println("M3 Method");
    }

}

class AbChild4 extends AbChild3 {
    public static void main(String[] args) {
        AbChild4 a4 = new AbChild4();
        a4.m1();
        a4.m2();
        a4.m3();
        a4.m4();
    }
}
package com.oop.Abstraction;

abstract class AbbFirst {
    abstract void m1();
    abstract void m2();
void m3(){
    System.out.println("M3 Method");
}
}
class AbstChild extends AbbFirst{
        void m1(){
            System.out.println("M1 method");
        }

        void m2(){
            System.out.println("M2 method");
        }

    public static void main(String[] args) {
        AbstChild ac = new AbstChild();
        ac.m1();
        ac.m2();
        ac.m3();
    }
}

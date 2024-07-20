package com.oops.Polymorphism;
//
//// A Simple Java program to demonstrate
//// Overriding and Access-Modifiers
//
//class Parent {
//    // private methods are not overridden
//    private void m1() {
//        System.out.println("From parent m1()");
//    }
//
//    protected void m2() {
//        System.out.println("From parent m2()");
//    }
//}
//
//class ChildP extends Parent {
//    // new m1() method
//    // unique to Child class
//    void m1() {
//        System.out.println("From child m1()");
//    }
//
//    // overriding method
//    // with more accessibility
//    @Override
//    public void m2() {
//        System.out.println("From child m2()");
//    }
//}
//
//// Driver class
//class Main {
//    public static void main(String[] args) {
//        Parent obj1 = new Parent();
//        obj1.m2();
//        Parent obj2 = new ChildP();
//        obj2.m2();
//    }
//}
//

class MethodOverriding {
   static class Animal {
    }

   static class Dog extends Animal {

    }

    static class Parent {
        Animal m1() {
            System.out.println("Animal");
            return new Animal();
        }
    }

   static class Child99 extends Parent {

        Dog m1() {
            System.out.println("Dog");
            return new Dog();
        }
    }

    public static void main(String[] args) {
        Parent c = new Child99();
    }
}

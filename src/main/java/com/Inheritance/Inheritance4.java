package com.Inheritance;

public class Inheritance4 {
    void i4(){
        System.out.println("I4 method");
    }
}
class Puppy extends Inheritance4{
        void i4(){

            System.out.println("I41 method");
        }
        void i42(){
            super.i4();
            this.i4();
            System.out.println("I42 method");
        }
    public static void main(String[] args) {
        new Puppy().i42();
    }
}

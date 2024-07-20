package com.methods;

public class Test3   {
    //Instance variables
    int age=12;
    int name=11;
    void data(int age , int name){
        System.out.println(age+name); //Local variables
        System.out.println(this.age+this.name); // this -> used to represent the Instance variables
    }

    public static void main(String[] args) {
        Test3 t3=new Test3();
        t3.data(20,20); // Local variable
    }
}

package com.methods;

// THIS IS USED TO REPRESENT THE INSTANCE VARIABLES


// Method variables are always local
public class Method1 {
//    instance variables
    int myAge = 10;
    int herAge = 8;
    void a(int myAge, int herAge) // Local variables
    {
        System.out.println(myAge + herAge); // local variables

        System.out.println(this.myAge+this.herAge); // Instance variables
    }
    public static void main(String[] args) {
        Method1 method1 = new Method1();
        method1.a(29, 25); // Local variables
    }
}

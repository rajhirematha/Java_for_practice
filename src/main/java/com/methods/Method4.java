package com.methods;

// Method returning Objects

public class Method4 {
    Method4 method4(){
        System.out.println("Method 4");
        return new Method4();
    }
    Method4 method44(){
        System.out.println("Method 44");
        return this;
    }


    public static void main(String[] args) {
Method4 m4 = new Method4();
Method4 m444= m4.method4();
Method4 me43 =m4.method44();
    }
}

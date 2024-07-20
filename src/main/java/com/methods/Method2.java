package com.methods;


public class Method2 {
    int age;
    String name;
    void method2(int age, String name){
        System.out.println(age+" "+name);
        System.out.println(this.age+" "+this.name);
    }
    static void method22(char R, int number){
        System.out.println(R+" "+number);

    }

    public static void main(String[] args) {
new Method2().method2(29,"Raju");
Method2.method22('r',98);
    }
}

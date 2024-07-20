package com.oops.Polymorphism;

public class OperatorOverloading {
    int a,b;
    void op(int a, int b){
        System.out.println("Operator");
    }
}
class OOp{
    public static void main(String[] args) {
        OperatorOverloading opp = new OperatorOverloading();
        opp.op(1,2);
    }
}
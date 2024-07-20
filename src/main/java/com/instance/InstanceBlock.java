package com.instance;

/*public class InstanceBlock {
InstanceBlock(){
    System.out.println("0 Argument block");
}
    InstanceBlock(int a){
        System.out.println("1 Argument block");
    }
    InstanceBlock(String f, char c){
        System.out.println("2 Argument block");
    }

    {
        System.out.println("Instance Block  1  ---------------");
    }{
        System.out.println("Instance Block  2  ---------------");
    }

    public static void main(String[] args) {
        new InstanceBlock();
        new InstanceBlock(1);
        new InstanceBlock("Raj", 's');

    }
}*/

// Instance block to initialise the value 'eid'
/*
public class InstanceBlock {
        int eid;
        void disp(){
        System.out.println(eid);
    }
    {
        eid=11;
    }

    public static void main(String[] args) {
        new InstanceBlock().disp();
    }
}*/

/*
public class InstanceBlock {
    InstanceBlock()
    {
//        Here 'THIS' is used to call the other Constructor Block
        this(10);
        System.out.println("0 arg");
    }

    InstanceBlock(int a){
        System.out.println("1 args");
    }
    {
        System.out.println("Instance Block");
    }
    public static void main(String[] args) {


        new InstanceBlock();
    }

}*/

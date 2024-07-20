package com.methods;

public class Method3 {
        int method3(){
            System.out.println("Method 3");
            return 10;
        }
        static char method33(){
            System.out.println("Method 33");
            return 'r';
        }

    public static void main(String[] args) {

            // class name with method name
         System.out.println(Method3.method33());

        //Reference variable with method name
        Method3 method31 = new Method3();
        System.out.println(method31.method3());

    }
}

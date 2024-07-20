package com.methods;

// Local and Instance variables are of SAME name
//public class Audi {
//    int a = 10, b = 20; // instance variables
//    void audi(int a, int b) {
//        System.out.println(a * b); // local variables
//        System.out.println(this.b + this.a); // instance variables
//    }
//    public static void main(String[] args) {
//        Audi a1 = new Audi();
//        a1.audi(25,2); // local variables
//    }
//}


// Method returning primitive values
/*
public class Audi {
  int m1(){
    System.out.println("Method 1");
    return 10;
  }
static String m2(){
  System.out.println("Method 2");
  return "Raj";
}
  public static void main(String[] args) {
    Audi audi = new Audi();
    System.out.println(audi.m1());
    System.out.println(Audi.m2());
    }
}
*/



// Method returning objects
/*
class Benz{}
class BMW{}
public class Audi {
    Benz m1(int a, String str){
        System.out.println("Benz returning"+" "+a+" "+str);
        return new Benz();
    }

  static BMW m2(char c){
        System.out.println("BMW returning"+" "+c);
        return new BMW();
    }
  public static void main(String[] args) {
        Audi audi = new Audi();
       audi.m1(8,"RAJ");

      Audi.m2('c');
    }
}
*/

// Return the CURRENT CLASS OBJECT, use THIS KeyWord with RETURN
/*
public class Audi {
    Audi m1(){
        System.out.println("Current class object");
        return this;
    }
  public static void main(String[] args) {
      Audi a = new Audi();
      a.m1();
    }
}
*/



public class Audi {
    static class Emp {}
    static class Students{}
     Emp emp(){
        System.out.println("EMP Objects returning");
        return new Emp();
    }
     Students students(){
        this.emp();
        System.out.println("STUDENTS Objects returning");
        return new Students();
    }

  public static void main(String[] args) {
        Audi a = new Audi();
//      a.emp() returns some employee type, store it in 'Emp e'
        Emp e = a.emp();

//      System.out.println(e); This will generate HASH Code, so we wont print

    }
}















/* public class Audi {
  public static void main(String[] args) {
    }
}*/

















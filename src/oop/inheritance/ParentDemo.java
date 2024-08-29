package oop.inheritance;


//Inheritance  :
//Child class inherit all the methods and variable from Parent class with the help of extend keyword
//Only public, protected, default methods and variables can only access in the child class
//Inheritance is used for code reusability
//Without creating Parent class object we can access all the methods and Variables using child class object because of extend keyword
//If we creates child class object the constructor of child class implicitly class by jvm


//Parent
public class ParentDemo extends Object{

    ParentDemo(){
        super();
        System.out.println("In Parent Demo");
    }

    int farm = 10;

    int noOfVehicles = 5;

    private int a = 100;

    private void m2(){
        System.out.println("In m2");
    }

    public void m1(){

        //access private method and variables
        ParentDemo obj = new ParentDemo();
        System.out.println("Obj.a " +obj.a);
        obj.m2();
        System.out.println("In m1");
    }

    protected void m3(){
        System.out.println("In m3");
    }

    void m4(){
        System.out.println("in m4");
    }

}



//Child
class ChildDemo extends ParentDemo{

    ChildDemo(){
        super();
        System.out.println("In ChildDemo");
    }

    public void c1(){
        System.out.println("In child C1");
    }

    public static void main(String[] args) {
        ChildDemo c = new ChildDemo();
        c.m1();
        c.c1();
        c.m3();
        c.m4();
    }
}
package oop;

public class ConstructorDemo{

    //Constructor is used for initialised instance variables
    //Constructor and class name should be same by default
    //Three types of constructors : 1) default constructor , 2)No - arg constructor , 3)Parameterised constructor
    //Constructor does not have return type


    int a = 100;

    ConstructorDemo(){
        System.out.println("In Constructor");
    }

    ConstructorDemo(int a , int b){
        System.out.println(this);
        System.out.println("In Param. constructor");
    }

    public static void main(String[] args) {

        //No - arg const.
        ConstructorDemo demo = new ConstructorDemo();
        demo.a = 200;
        System.out.println(demo);

        //Parameterised const.
        ConstructorDemo obj = new ConstructorDemo(10,20);
        obj.a = 300;

        System.out.println(demo.a);
        System.out.println(obj.a);

    }
}

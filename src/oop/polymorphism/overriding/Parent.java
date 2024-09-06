package oop.polymorphism.overriding;

public class Parent {

    Parent(){
        System.out.println("In Parent const");
    }

     public void m1(){
        System.out.println("In Parent m1");
    }
}


class Child extends Parent{
    Child(){
        super();
        System.out.println("In Child const");
    }

    //Overriding
    public void m1(){
        System.out.println("In Child m1");
    }
}

class Demo{
    public static void main(String[] args) {
        Child c = new Child();
    }
}
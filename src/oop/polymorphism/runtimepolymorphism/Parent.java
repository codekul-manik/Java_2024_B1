package oop.polymorphism.runtimepolymorphism;

//RunTimePolymorphism
public class Parent {

    int a = 100;

    Parent(){
        System.out.println("In Parent Constructor");
    }

    public void m1(){
        System.out.println("In Parent m1");
    }

}


class Child extends Parent{
    int a = 200;

    //overriding
    public void m1(){
        System.out.println("In child m1");
    }
}


class Demo{

    public static void main(String[] args) {

        //Runtime polymorphism
        Parent p = new Child();
        p.m1();
        System.out.println(p.a);
    }
}


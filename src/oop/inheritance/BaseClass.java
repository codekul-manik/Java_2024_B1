package oop.inheritance;

public class BaseClass {

    BaseClass(){
        System.out.println("In BaseClass");
    }

    int a = 100;
    public void m1(){
        System.out.println("In m1 BaseClass");
    }
    public void m2(){
        System.out.println("In m2 BaseClass");
    }
}


class DerivedClass extends BaseClass{

    DerivedClass(){
        System.out.println("In Derived class constructor");
    }

    public void m3(){
        System.out.println("In m3 Derived class");
    }
}


class Demo{

    int a = 1000;

    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass();
        System.out.println("derivedclass.a : " + derivedClass.a);
    }
}
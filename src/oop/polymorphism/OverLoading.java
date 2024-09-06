package oop.polymorphism;


//OverLoading

//same methods but different parameters
//Overloading happens only in the Same class
//return type of method does not matter as well as access specifier
//Overloading does not need relation of the classes
public class OverLoading {

    OverLoading(){
        System.out.println("In Overloading constructor");
    }

    //no parameterised
    public void m1(){
        System.out.println("In m1");
    }

    //parameterised

    public void m1(int a){
        System.out.println("In m1");
    }

    public int m1(int a, int b){
        return 0;
    }

    private int m1(double a){
        return 0;
    }

    public static void main(String[] args) {
        //Object : For calling instance methods we need Objects of the class
        OverLoading obj1 = new OverLoading();
        obj1.m1();
        obj1.m1(10);
        int ans = obj1.m1(10,20);               //return value
        System.out.println(ans);
        obj1.m1(12.21);

        //arguments

    }
}

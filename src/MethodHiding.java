package oop;

public class MethodHiding {

    public void m1(){
        System.out.println("in m1");
    }

    static void m2(){
        System.out.println("In Parent m2");
    }
}


class ChildC extends MethodHiding{

    public void m1(){
        System.out.println("in Child m1");
    }

    static void m2(){
        System.out.println("In Child m2()");
    }
}

class MainnD{
    public static void main(String[] args) {
        MethodHiding c = new ChildC();
        c.m1();
        c.m2();

    }
}

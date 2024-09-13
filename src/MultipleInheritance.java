package oop;


interface Man{

    void m1();

    int a = 20;

    //concrete
    default void display(){
        System.out.println("In display");
    }

    static void displayStat(){
        System.out.println("In dis stat");
    }
}

class Manik implements Man{

    @Override
    public void m1() {
        System.out.println("In m1");
    }


    public static void main(String[] args) {
        Manik obj = new Manik();
        obj.m1();
        obj.display();
        Man.displayStat();
    }
}


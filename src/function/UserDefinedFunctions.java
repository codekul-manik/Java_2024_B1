package function;

public class UserDefinedFunctions {

    //Instance functions
    public void concatFunction(String one, String two){
        System.out.println(one + two);
    }

    public static void main(String[] args) {
        String str1 = "Man";
        String str2 = "ik";

        //Object create
        UserDefinedFunctions obj = new UserDefinedFunctions();

        //call
        obj.concatFunction(str1, str2);

        OneSys.obj.fun();
    }
}


class OneSys{
    static Func obj = new Func();
}


class Func{
    public void fun(){
        System.out.println("In fun");
    }
}
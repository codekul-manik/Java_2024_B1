package function;

public class StaticFun {


    public static int add(int a , int b){
        int ans = a + b;
        return ans;
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }


    public static void main(String[] args) {
        //call
        int ans = StaticFun.add(10,20);            //100,300,300
        System.out.println(ans);

        StaticFun.sum(10,20);

    }
}

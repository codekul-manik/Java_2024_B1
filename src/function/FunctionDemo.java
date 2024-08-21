package function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FunctionDemo {

    //functions type :
    //1 : Pre-defined
    //2 : User-defined

    //User defined function
    public static int addNum(int a , int b){
        return a + b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        System.out.println("Why not?");

        //call function
        int ans = FunctionDemo.addNum(10,20);
        System.out.println(ans);
    }
}

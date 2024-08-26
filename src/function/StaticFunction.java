package function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Demo{
    int mobile = 0;
    int ans = 0;

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
    public void setAns(int ans){
        this.ans = ans;
    }

    public int getMobile(){
        return this.mobile;
    }

    public int getAns(){
        return this.ans;
    }
}
public class StaticFunction {

    //Instance function / Non static function
    //Return Class type value
    public Demo squareOftwoNum(int one, int two){
        Demo d = new Demo();
        d.setMobile(12345678);
        int ans = (one*one) + 2 *(one*two) + (two*two);       //a^2 + 2ab + b^2
        d.setAns(ans);
        return d;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Square of two numbers problem");
        System.out.println("Enter two numbers : ");

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        //call function
        StaticFunction obj = new StaticFunction();
        Demo ans = obj.squareOftwoNum(num1, num2);
        System.out.println(ans.getMobile());
        System.out.println(ans.getAns());
    }
}

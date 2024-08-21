package function;

import java.util.Scanner;

public class FunctionTwo {

    public void addTwoNum(int num1 , int num2){
        System.out.println("Addition of two num is : "+(num1+num2));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FunctionTwo functionDemo = new FunctionTwo();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter two numbers : ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            functionDemo.addTwoNum(num1, num2);
        }
    }
}

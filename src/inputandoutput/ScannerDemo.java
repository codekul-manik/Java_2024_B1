package inputandoutput;

import java.util.*;
public class ScannerDemo {
    public static void main(String[] args) {

        //Connection established for taking inputs from user
        Scanner sc = new Scanner(System.in);

        //for String
        System.out.println("Enter your name : ");
        String name = sc.next();                    //next method return type : String
        System.out.println(name);

        //for int
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Your age is : "+ age);

        //long
        System.out.println("Enter your mobile number : ");
        long number = sc.nextLong();
        System.out.println("Number is : "+ number);

        //char
        System.out.println("Enter the character : ");
        char c = sc.next().charAt(0);                   //for character inputs
        System.out.println("Character is : "+ c);


    }
}

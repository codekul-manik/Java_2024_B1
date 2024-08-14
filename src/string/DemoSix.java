package string;

import java.util.Arrays;
import java.util.Scanner;

public class DemoSix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Take String from user
        System.out.println("Enter String");
        String str = sc.next();
        System.out.println("String is : " + str);

        //String convert into char array
        char[] c = str.toCharArray();

        //copyValueOf method will convert character array into String
        String ans = String.copyValueOf(c);
        System.out.println("Answer is : " + ans);

        //print char array
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

        //Reverse character array
        int start = 0;
        int end = c.length - 1;
        while (start <= end){
            //swap
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;

            start++;
            end--;
        }

        System.out.println("Reverse array ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

        System.out.println("Reverse String is : "+ String.copyValueOf(c));

        System.out.println("charAt : " + str.charAt(0));
    }
}

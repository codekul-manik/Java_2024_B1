package string;

import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sc.next();

        System.out.println("String is : "+ str);

        //convert string into character array
        char[] carr = str.toCharArray();

        System.out.println("character array :");
        for (int i = 0; i < carr.length; i++) {
            System.out.print(carr[i] + " ");
        }
        System.out.println();

        //2 pointers
        int start = 0;
        int end = carr.length - 1;

        while (start <= end){
            //swap
            char temp = carr[start];
            carr[start] = carr[end];
            carr[end] = temp;

            start++;
            end--;
        }

        //print array :
        for (int i = 0; i < carr.length; i++) {
            System.out.print(carr[i] + " ");
        }
        System.out.println();

        String newStr = String.valueOf(carr);
        System.out.println("Reversed String is : " + newStr);
    }
}

package array;

import java.util.Scanner;

public class ArrayDemoOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");

        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Array elements are : ");

        //access
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        System.out.println("Put element in the array :");
        //put
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element : ");
            int num = sc.nextInt();
            arr[i] = num;
        }

        System.out.println("Array elements after put the values : ");
        //access
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

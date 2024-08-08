package array;

import java.util.Scanner;

public class Array1D {

    public static void main(String[] args) {

        //way : 1
        //int[] arr = {10, 20, 30, 40, 50};
        //collection of similar data types
        //allocate sequential memory
        //allocate memory on heap area
        //one variable can represent all the elements in array
        //we can access elements using index
        //always index start with zero
        //Array can be considered as objects because it will get memory on heap area
        //Array initialised by zero by default

        //way : 2
//        int[] arr = new int[2];     // 2 : is size of array
//
//        System.out.println(arr[0]); //0
//        System.out.println(arr[1]); //0
//        System.out.println(arr[2]); //0 or exception
//
        //size from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        //size from use
        //declared array
        int[] arr = new int[size];


        //access element in the array
        System.out.println("Your array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        //put the element in array from user
        for(int i=0; i<size; i++){
            System.out.println("Please enter the element : ");
            int num = sc.nextInt();
            arr[i] = num;
        }

        //access the element from array
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //addition of array
        int total = 0;
        for (int i = 0; i < arr.length ; i++) {
            total = total + arr[i];
        }
        System.out.println("Addition of array is : "+ total);
    }
}

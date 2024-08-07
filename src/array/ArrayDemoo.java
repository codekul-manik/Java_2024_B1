package array;

import java.util.Scanner;

public class ArrayDemoo {
    public static void main(String[] args) {

//        //syntax
//        int[] arrName = {10,20,30,40};
//
//        //for getting array length
//        System.out.println("Length of array is : ");
//        System.out.println(arrName.length);
//
//        //access all elements using for loop
//        for(int i=1; i< arrName.length; i++){
//            System.out.println(arrName[i]);         //i represent to the index
//        }
//
//        //get even numbers from array
//        for (int i = 0; i < arrName.length; i++) {
//            if(arrName[i] % 2 == 0){
//                System.out.println("Even numbers are : " + arrName[i]);
//            }
//        }



        //Q. frequency of digits : 7796484784
        //user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your number : ");
        long number = sc.nextLong();                                //7796484784

        long[] arr = {0,0,0,0,0,0,0,0,0,0};

        for (long l = number; l!=0; l = l/10) {
            long rem = l % 10;
            arr[(int) rem]++;
        }

        for(int i=0; i< arr.length; i++){
            if(arr[i] != 0){
                System.out.println("Frequency of "+ i + "=" + arr[i]);
            }
        }
        System.out.println("Scannner");
        String s = sc.next();
    }
}

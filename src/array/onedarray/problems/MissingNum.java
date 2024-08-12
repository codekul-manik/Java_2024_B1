package array.onedarray.problems;

import java.util.Arrays;

public class MissingNum {

    static void findMissingNum(int[] arr){
        //array sort
        Arrays.sort(arr);

        int num = arr[0];
        for(int i=0; i<arr.length; i++){
            if(num != arr[i]){
                System.out.println("Missing number is "+ num);
                break;
            }
            num++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {77,79,81,80};

        System.out.println("Your array is : ");
        for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
        }
        System.out.println();

        //function
        MissingNum.findMissingNum(arr);
    }
}

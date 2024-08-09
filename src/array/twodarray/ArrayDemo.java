package array.twodarray;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        //2D Array

        //1D Array
//        int[] arr = new int[10];

        //2D Array
        //syntax
        //int[][] arrName = new int[row][column];

        //int: array-> data type
        //[][] : array dimensions
        // arrName : array name
        // new int : memory allocate on heap area
        //[][] : array dimension
        //[] first : row
        //[] column

        //2d array
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter rows : ");
//        int rows = sc.nextInt();
//
//        System.out.println("Enter columns : ");
//        int columns = sc.nextInt();

//        //2d array declared
//        int[][] arr = new int[rows][columns];

        //access

//        //rows
//        for(int i=0; i<rows; i++){
//            //columns
//            for(int j=0; j<columns; j++){
//
//            }
//        }


        //2d array
        //draw diagram for this array
        int[][] arr = {{10,30,10,50}, {20,30,80,90}};
        //80

        //access elements
        for (int i = 0; i <2; i++) {                //row : i
            for (int j = 0; j < 4; j++) {           //column : j
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //addition of elements in array


        int[] demoArr = {10,20,40,30};
        int start = 0;
        int end = demoArr.length -1;

        int add = 0;
        for (int i = 0;  start <= end; i++) {

            if(start == end){
                add = add + demoArr[start];
                break;
            }
            add = add + demoArr[start] + demoArr[end];
            start++;
            end--;
        }
        System.out.println("Addition of array is : " + add);
    }
}

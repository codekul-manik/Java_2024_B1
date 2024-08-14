package array.onedarray.problems;

public class CopyArray {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        int[] newArr = new int[arr.length];

        //print newArr
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();


        //copy array : initial address of array copy here instead of whole array elements
//        newArr = arr;
//
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.print(newArr[i] + " ");
//        }
//        System.out.println();


        //copy whole array elements

        for (int i = 0; i < arr.length; i++) {
            //copy array elements
            newArr[i] = arr[i];
        }

        System.out.println("Array copy");

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }
}

package array.onedarray.problems;

import java.util.Arrays;

public class findPerfectPosition {

    static int findInsertPosition(int[] arr, int target){
        //Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            if(target > arr[i] && target <= arr[i+1]){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println("find insert position for element");
        int[] arrName = {21,21,22,25,24,24,24,25};
        int target = 24;

        int ans = findInsertPosition(arrName, target);

        System.out.println("Perfect insert position is : "+ ans);
    }
}

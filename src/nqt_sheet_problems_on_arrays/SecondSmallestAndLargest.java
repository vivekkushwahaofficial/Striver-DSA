package nqt_sheet_problems_on_arrays;

import java.util.Arrays;

public class SecondSmallestAndLargest {
//    Brute Force Approach
    public static int[] Element(int[] arr){
        if(arr.length < 2){
            System.out.println("Array must contain at least 2 elements");
            return new int[]{-1, -1};
        }
        Arrays.sort(arr);

        return new int[]{arr[1], arr[arr.length-2]};
    }

    public static void main(String[] args) {
        int[] arr1 = {23, 32, 43, 54, 51};

        int[] result1 = Element(arr1);
        System.out.println("Second Smallest: " +result1[0]);
        System.out.println("Second Largest: " +result1[1]);

        int[] arr2 = {0, -1, 4, 5, 2, 56, 3, 32};
        int[] result2 = Element(arr2);
        System.out.println("Second Smallest: " +result2[0]);
        System.out.println("Second Largest: " +result2[1]);

        int[] arr3 = {1};
        int[] result3 = Element(arr3);
        System.out.println("Second Smallest: " +result3[0]);
        System.out.println("Second Largest: " +result3[1]);
    }
}

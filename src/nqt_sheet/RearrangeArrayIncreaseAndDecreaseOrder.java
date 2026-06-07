package nqt_sheet;

import java.util.Arrays;

public class RearrangeArrayIncreaseAndDecreaseOrder {
    public static void rearrangeArray(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        int left = n/2;
        int right = n - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5,7,6,8,9};
        rearrangeArray(arr);
    }
}

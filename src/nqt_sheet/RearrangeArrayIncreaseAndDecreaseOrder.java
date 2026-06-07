package nqt_sheet;

import java.util.Arrays;

public class RearrangeArrayIncreaseAndDecreaseOrder {
    public static void rearrangeArray(int[] arr){
        Arrays.sort(arr);
        int n = arr.length - 1;
        for(int i = n/2; i < n; i++){
            int temp = arr[i];

        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5,7,4,8,};
//        System.out.println(Arrays.toString(rearrangeArray(arr)));
//        rearrangeArray(arr);
    }
}

package nqt_sheet_problems_on_arrays;

public class LargestNumber {
    public static int LargestElement(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 43, 66};
        int max = LargestElement(arr);
        System.out.println("Largest Element in the Array: "+ max);
    }
}

package nqt_sheet_problems_on_arrays;

public class SumOfArray {
    public static int arraySum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 3, 8};

        int result = arraySum(arr);
        System.out.println(result);
    }
}

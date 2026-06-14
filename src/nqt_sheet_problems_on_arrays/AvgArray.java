package nqt_sheet_problems_on_arrays;

import java.util.Scanner;

public class AvgArray {
    public static double avgArrays(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double)sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        double result = avgArrays(arr);
        System.out.println(result);
        scanner.close();
    }
}

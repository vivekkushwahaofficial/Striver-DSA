package nqt_sheet;

import java.util.Scanner;

public class SmallestNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Size of Array: ");
//
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//        }
//        Arrays.sort(arr);
//        System.out.println("Smellest Number: "+ arr[0]);
//    }

    //Optimal Approach
    public static int smallestElement(int[] arr, int n) {
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of array: ");
        int n = scanner.nextInt();

        System.out.println("Enter Element: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = smallestElement(arr, n);
        System.out.println("Smallest number in a array: " + min);
    }
}



package nqt_sheet;

//import java.util.Arrays;
import java.util.Scanner;

public class Smallest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array: ");

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
//        for (int i = 0; i < n; i++) {
//        }
//        Arrays.sort(arr);
//        System.out.println("Smellest Number: "+ arr[0]);
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Smallest Number : "+ min);
    }
}

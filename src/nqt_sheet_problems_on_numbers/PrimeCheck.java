package nqt_sheet_problems_on_numbers;

import java.util.Scanner;

public class PrimeCheck {
    public static boolean isPrime(int n) {
        if( n <= 1){
            return false;
        }
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean prime = isPrime(num);

        if(prime){
            System.out.println(num +" is Prime");
        }else{
            System.out.println(num +" is not prime");
        }
    }
}

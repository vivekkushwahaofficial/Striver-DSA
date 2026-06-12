package nqt_sheet_problems_on_numbers;

import java.util.Scanner;

public class PalindromeInRange {
    public boolean palindromeInRange(int n) {
        int revNum = 0;
        int temp  = n;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            revNum = revNum * 10 + rem;
        }

        return revNum == temp;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        PalindromeInRange obj = new PalindromeInRange();
        for(int i = start; i <= end; i++){
            if(obj.palindromeInRange(i))
            System.out.print(i+ " ");
        }
    }
}

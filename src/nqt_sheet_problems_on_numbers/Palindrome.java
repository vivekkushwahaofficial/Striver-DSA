package nqt_sheet_problems_on_numbers;
import java.util.*;

public class Palindrome {
    public void isPalindrome(int n){
        int revNum = 0;
        int originalNum = n;

        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            revNum = revNum * 10 + rem;
        }
        if(revNum == originalNum){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Palindrome obj = new Palindrome();
        obj.isPalindrome(num);
        scanner.close();
    }
}

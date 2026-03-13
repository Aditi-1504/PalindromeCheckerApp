import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "madam";
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
import java.util.*;
public class PalindromeCheckerApp {
    public boolean checkPalindrome(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        char[] arr = normalized.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter a string to check palindrome:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        PalindromeCheckerApp checker = new PalindromeCheckerApp();
        boolean result = checker.checkPalindrome(input);
        if (result) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }
        scanner.close();
    }
}
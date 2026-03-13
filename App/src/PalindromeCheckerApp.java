import java.util.Scanner;
public class PalindromeCheckerApp {
    public static boolean reverseMethod(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    public static boolean twoPointerMethod(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(normalized);
        long end1 = System.nanoTime();
        long start2 = System.nanoTime();
        boolean result2 = twoPointerMethod(normalized);
        long end2 = System.nanoTime();
        System.out.println("\n--- Results ---");
        System.out.println("Reverse Method: " + (result1 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Execution Time: " + (end1 - start1) + " ns");
        System.out.println("\nTwo Pointer Method: " + (result2 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Execution Time: " + (end2 - start2) + " ns");
        scanner.close();
    }
}
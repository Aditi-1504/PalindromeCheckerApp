import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "madam";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

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
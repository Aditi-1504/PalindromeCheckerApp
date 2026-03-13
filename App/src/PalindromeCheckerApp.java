import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        //UC1
        System.out.println("=====================================");
        System.out.println("      Welcome to Palindrome Checker");
        System.out.println("=====================================");
        System.out.println("Application Name : PalindromeChecker App");
        System.out.println("Application Version : 1.0");
        System.out.println("-------------------------------------");
        System.out.println("Program started successfully.");
        System.out.println("Proceeding to next use case...");
        System.out.println("-------------------------------------");

        //UC2
        String word = "madam";
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        if (word.equals(reversed)) {
            System.out.println("The string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + word + "\" is NOT a Palindrome.");
        }
        System.out.println("Program finished.");

        //UC3
        String str = "madam";
        reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        if (str.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        //UC4
        str = "madam";
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (arr[left] != arr[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        //UC5
        String str = "madam";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        if (str.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
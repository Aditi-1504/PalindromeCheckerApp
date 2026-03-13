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
    }
}
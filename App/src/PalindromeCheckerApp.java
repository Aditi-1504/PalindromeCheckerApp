import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        class Node {
            char data;
            Node next;
            Node(char d) { data = d; }
        }
        String str = "madam";
        Node head = null, tail = null;
        for (int i = 0; i < str.length(); i++) {
            Node node = new Node(str.charAt(i));
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node prev = null, curr = slow;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node first = head, second = prev;
        boolean isPalindrome = true;
        while (second != null) {
            if (first.data != second.data) {
                isPalindrome = false;
                break;
            }
            first = first.next;
            second = second.next;
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
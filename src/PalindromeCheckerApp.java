import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "noon";
        //String input = "civic";
        System.out.println("Input text: " + input);

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                while (!queue.isEmpty()) {
                    char fromQueue = queue.remove();
                    char fromStack = stack.pop();

                    if (fromQueue != fromStack) {
                        isPalindrome = false;
                        break;
                    }
                }

                System.out.print("It is a Palindrome? : ");
                System.out.print("Is it a Palindrome? : ");
                System.out.println(isPalindrome);
            }

        }
    }
}
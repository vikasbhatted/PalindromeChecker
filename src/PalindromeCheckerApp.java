import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    // Two Pointer Approach (O(1) space)
    public static boolean twoPointerCheck(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Stack Approach (O(n) space)
    public static boolean stackCheck(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Deque Approach (O(n) space)
    public static boolean dequeCheck(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        long startTime = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long endTime = System.nanoTime();
        long duration1 = endTime - startTime;

        startTime = System.nanoTime();
        boolean result2 = stackCheck(input);
        endTime = System.nanoTime();
        long duration2 = endTime - startTime;

        startTime = System.nanoTime();
        boolean result3 = dequeCheck(input);
        endTime = System.nanoTime();
        long duration3 = endTime - startTime;

        System.out.println("\nResults:");
        System.out.println("Two Pointer Result: " + result1 + " | Time: " + duration1 + " ns");
        System.out.println("Stack Result:       " + result2 + " | Time: " + duration2 + " ns");
        System.out.println("Deque Result:       " + result3 + " | Time: " + duration3 + " ns");

        scanner.close();
    }
}
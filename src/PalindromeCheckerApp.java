/**
 * ============================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Goal:
 * Check palindrome using recursion.
 *
 * Flow:
 * 1. Recursive call compares start and end
 * 2. Base condition exits recursion
 *
 * Data Structure Used: Call Stack
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        boolean result = checkPalindrome(input, 0, input.length() - 1);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + result);
    }

    /**
     * Recursively checks whether a string is a palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean checkPalindrome(String s, int start, int end) {

        // Base condition: pointers crossed or equal
        if (start >= end) {
            return true;
        }

        // If mismatch found
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call (move inward)
        return checkPalindrome(s, start + 1, end - 1);
    }
}
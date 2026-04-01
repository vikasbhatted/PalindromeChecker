/**
 * ============================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Goal:
 * Ignore spaces and case while checking palindrome.
 *
 * Key Concepts:
 * - String preprocessing
 * - Regular expressions
 *
 * Data Structure: String
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";
        String normalized = normalize(input);
        boolean isPalindrome = checkPalindrome(normalized);

        System.out.println("Input: " + input);
        System.out.println("Normalized: " + normalized);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }

    /**
     * Removes spaces and converts to lowercase.
     */
    private static String normalize(String str) {
        return str
                .replaceAll("\\s+", "")  // remove spaces
                .toLowerCase();          // convert to lowercase
    }

    /**
     * Iterative palindrome check.
     */
    private static boolean checkPalindrome(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
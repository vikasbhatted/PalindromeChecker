import java.util.Scanner;

class PalindromeChecker {
    public boolean checkPalindrome(String input) {
        if (input == null) {
            return false;
        }

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
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        PalindromeChecker service = new PalindromeChecker();
        boolean result = service.checkPalindrome(input);

        if (result) {
            System.out.println("Result: TRUE (It is a palindrome)");
        } else {
            System.out.println("Result: FALSE (Not a palindrome)");
        }

        scanner.close();
    }
}
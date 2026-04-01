public class PalindromeCheckerApp {

    /**
     * Application entry point for UC2.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Input text: " + input);
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);

            char[] chars = input.toCharArray();
            int left = 0;
            int right = chars.length - 1;
            boolean isPalindrome = true;

            while (left < right) {
                if (chars[left] != chars[right]) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            System.out.print("It it a Palindrome? : ");
            System.out.println(input.equals(reverse));
            System.out.print("It is a Palindrome? : ");
            System.out.println(isPalindrome);
        }

    }
}
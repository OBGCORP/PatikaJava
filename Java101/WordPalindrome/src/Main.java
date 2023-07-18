import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += (word.charAt(i));
        }
        if (word.equals(reverse)) {
            System.out.println("The input is palindrome.");
            return true;
        } else {
            System.out.println("The input is not palindrome.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String word = scanner.nextLine();
        System.out.println(isPalindrome(word));
    }
}
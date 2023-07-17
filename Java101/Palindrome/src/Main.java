public class Main {
    static String isPalindrome(int number) {
        int temp = number, numberReversed = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            numberReversed = (numberReversed * 10) + lastNumber;
            temp /= 10;
        }
        if (number == numberReversed) {
            return number + " is palindrome.";
        }else {
            return number + " is not palindrome.";
        }

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(3443));
    }
}
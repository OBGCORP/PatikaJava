import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, i, counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        n = scanner.nextInt();

        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                counter += i;
            }
        }

        if (counter == n) {
            System.out.print(n + " is a perfect number.");
        } else {
            System.out.print(n + " is not a perfect number. ");
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, n, j;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number for the base: ");
        n = scanner.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
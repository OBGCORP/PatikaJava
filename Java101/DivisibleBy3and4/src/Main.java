import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        int sum = 0;
        int counter = 0;
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                counter++;
            }
        }
        System.out.println("Average: " + sum / counter);
    }
}
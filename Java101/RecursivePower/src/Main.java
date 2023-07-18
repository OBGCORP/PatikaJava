import java.util.Scanner;

public class Main {
    public static long recursivePower(int base, int power) {
        if (power == 0)
            return 1;
        else if (power == 1)
            return base;
        else return base * recursivePower(base, power - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter power: ");
        int power = scanner.nextInt();
        System.out.println(recursivePower(base, power));
    }
}
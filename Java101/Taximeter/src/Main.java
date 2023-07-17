import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void taximeter() {
        System.out.println("Enter kilometers to be travelled by taxi");
        float distance = scanner.nextFloat();
        float chargePerKm = 2.2f;
        float payment = (distance * chargePerKm) + 10;
        System.out.println("Taximeter: " + (payment < 20 ? 20 : payment));
    }
    public static void main(String[] args) {
        taximeter();
    }
}
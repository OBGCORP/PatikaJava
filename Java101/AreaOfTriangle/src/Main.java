import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void areaOfTriangle() {
        System.out.println("Enter first side of triangle");
        float a = scanner.nextFloat();
        System.out.println("Enter second side of triangle");
        float b = scanner.nextFloat();
        System.out.println("Enter third side of triangle");
        float c = scanner.nextFloat();
        float u = (a + b + c) / 2f;
        float area = (float) Math.sqrt(Double.valueOf( u * (u - a) * (u - b) * (u - c)));
        System.out.println("Area of the triangle: " + area);
    }
    public static void main(String[] args) {
        areaOfTriangle();
    }
}
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void areaOfCircleSlice() {
        System.out.println("Enter circle radius");
        float r = scanner.nextFloat();
        System.out.println("Enter circle slice degree");
        float a = scanner.nextFloat();
        float area = (3.14f * ( r * r) * a) / 360;
        System.out.println("Area of circle slice: " + area);
    }
    public static void main(String[] args) {
        areaOfCircleSlice();
    }
}
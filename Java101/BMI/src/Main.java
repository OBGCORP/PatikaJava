import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        float height = scanner.nextFloat();
        System.out.print("Lütfen kilonuzu giriniz: ");
        float weight = scanner.nextFloat();
        float BMI = weight / (height * height);
        System.out.println("Vücut kitle endeksiniz: " + BMI);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut kaç kilo? : ");
        float armut = 2.74f * scanner.nextFloat();
        System.out.print("Elma kaç kilo? : ");
        float elma = 3.67f * scanner.nextFloat();
        System.out.print("Domates kaç kilo? : ");
        float domates = 1.11f * scanner.nextFloat();
        System.out.print("Muz kaç kilo? : ");
        float muz = 0.95f * scanner.nextFloat();
        System.out.print("Patlıcan kaç kilo? : ");
        float patlican = 5f * scanner.nextFloat();
        System.out.println("Toplam tutar: " + (armut + elma + domates + muz + patlican));
    }
}
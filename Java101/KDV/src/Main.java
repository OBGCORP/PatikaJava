import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void calculateVAT() {
        System.out.println("Enter price amount you want to calculate VAT for");
        double price = scanner.nextDouble();
        double VATpercentageUnder1000 = 0.18;
        double VATpercentageAbove1000 = 0.08;
        double VATamount = price > 1000 ? price * VATpercentageAbove1000 : price * VATpercentageUnder1000;
        double priceWithVAT = price + VATamount;
        System.out.println("Price without VAT: " + price +
                "\nCalculated VAT amount: " + VATamount +
                "\nPrice with VAT: " + priceWithVAT);
    }
    public static void main(String[] args) {
        calculateVAT();
    }
}
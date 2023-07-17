import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b;
        int select;

        System.out.println("İlk sayıyı giriniz: ");
        a = input.nextDouble();

        System.out.println("İkinci sayıyı giriniz: ");
        b = input.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz: ");

        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam: " + (a + b));
                break;
            case 2:
                System.out.println("Çıkarma: " + (a - b));
                break;
            case 3:
                System.out.println("Çarpma: " + (a * b));
                break;
            case 4:
                if (b == 0)
                    System.out.println("0'a bölemezsiniz");
                else
                    System.out.println("Bölme: " + (a / b));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız");
        }
    }
}
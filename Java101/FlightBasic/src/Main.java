import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double km, costPerKm = 0.1, total;
        byte type;
        int age;
        boolean isError = false;

        System.out.print("Mesafeyi dahil ediniz : ");
        km = scanner.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        age = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        type = scanner.nextByte();
        total = km * costPerKm;

        if (age < 12) {
            total *= 0.5;
        } else if (age >= 12 && age <= 24) {
            total *= 0.9;
        } else if (age > 65) {
            total *= 0.7;
        }

        switch (type) {
            case 2:
                total *= 0.8;
                total *= 2;
                break;
            case 1:
                total = total;
                break;
            default:
                isError = true;
        }

        if (!(km >= 0)) {
            isError = true;
        }

        if (isError == true) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            System.out.println("Toplam Tutar: " + total + " TL");
        }
    }
}
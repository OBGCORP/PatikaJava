import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0, i, b = 1, girdi;
        System.out.print("Lütfen sayı değeri giriniz");
        girdi = scanner.nextInt();

        for (i = 0; i < girdi; i++) {
            System.out.print(a);
            System.out.print(" + ");
            System.out.print(b);
            System.out.print(" = ");
            System.out.println(a + b);
            a = b;
            b++;
        }
    }
}
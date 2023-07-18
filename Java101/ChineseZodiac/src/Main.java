import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        int result = scanner.nextInt() % 12;
        if (result == 0)
            System.out.println("Çin zodyağı burcunuz: Maymun");
        else if (result == 1)
            System.out.println("Çin zodyağı burcunuz: Horoz");
        else if (result == 2)
            System.out.println("Çin zodyağı burcunuz: Köpek");
        else if (result == 3)
            System.out.println("Çin zodyağı burcunuz: Domuz");
        else if (result == 4)
            System.out.println("Çin zodyağı burcunuz: Fare");
        else if (result == 5)
            System.out.println("Çin zodyağı burcunuz: Öküz");
        else if (result == 6)
            System.out.println("Çin zodyağı burcunuz: Kaplan");
        else if (result == 7)
            System.out.println("Çin zodyağı burcunuz: Tavşan");
        else if (result == 8)
            System.out.println("Çin zodyağı burcunuz: Ejderha");
        else if (result == 9)
            System.out.println("Çin zodyağı burcunuz: Yılan");
        else if (result == 10)
            System.out.println("Çin zodyağı burcunuz: At");
        else if (result == 11)
            System.out.println("Çin zodyağı burcunuz: Koyun");
    }
}
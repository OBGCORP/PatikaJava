import java.util.*;

class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int counter, sayi, min = 0, max = 0;
        System.out.print("Girilecek sayı adedini belirtiniz");
        counter = input.nextInt();
        while (counter != 0) {
            System.out.print("Sayi değerini giriniz");
            sayi = input.nextInt();
            if (sayi > max) max = sayi;
            else if (sayi < min) min = sayi;
            counter--;


        }
        System.out.println("En büyük: " + max);
        System.out.println("En küçük" + min);

    }
}
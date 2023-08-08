import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Dizi Boyutunu Giriniz : ");
        int indexArray = input.nextInt();
        int[] numbers = new int[indexArray];

        System.out.println("Dizinin Elemanlarını Giriniz : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + ". Elemanı Gir : ");
            numbers[i] = input.nextInt();
        }

        System.out.println("Dizi : " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sıralı : " + Arrays.toString(numbers));
    }
}
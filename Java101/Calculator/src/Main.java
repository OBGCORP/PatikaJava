import java.util.Scanner;

public class Main {
    static void toplama() {
        Scanner scan = new Scanner(System.in);
        int sayi, sonuc = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            sayi = scan.nextInt();
            if (sayi == 0) {
                break;
            }
            sonuc += sayi;
        }
        System.out.println("Sonuç : " + sonuc);
    }

    static void cikarma() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int adet = scan.nextInt();
        int sayi, sonuc = 0;

        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayı :");
            sayi = scan.nextInt();
            if (i == 1) {
                sonuc += sayi;
                continue;
            }
            sonuc -= sayi;
        }

        System.out.println("Sonuç : " + sonuc);
    }

    static void carpma() {
        Scanner scan = new Scanner(System.in);
        int sayi, sonuc = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            sayi = scan.nextInt();

            if (sayi == 1) break;

            if (sayi == 0) {
                sonuc = 0;
                break;
            }
            sonuc *= sayi;
        }

        System.out.println("Sonuç : " + sonuc);
    }

    static void bolme() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int adet = scan.nextInt();
        double sayi, sonuc = 0.0;

        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayı :");
            sayi = scan.nextDouble();
            if (i != 1 && sayi == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                sonuc = sayi;
                continue;
            }
            sonuc /= sayi;
        }

        System.out.println("Sonuç : " + sonuc);
    }

    static void usluSayi() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz :");
        int taban = scan.nextInt();
        System.out.print("Üs değerini giriniz :");
        int us = scan.nextInt();
        int sonuc = 1;

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        System.out.println("Sonuç : " + sonuc);
    }

    static void faktoriyel() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int sayi = scan.nextInt();
        int sonuc = 1;

        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }

        System.out.println("Sonuç : " + sonuc);
    }

    static void modAlma() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scan.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scan.nextInt();
        int sonuc = sayi1 % sayi2;
        System.out.println("Sonuç: " + sonuc);
    }

    static void dikdortgenHesapla() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dikdörtgenin uzun kenarını girin: ");
        int uzunKenar = scan.nextInt();
        System.out.print("Dikdörtgenin kısa kenarını girin: ");
        int kisaKenar = scan.nextInt();
        int alan = uzunKenar * kisaKenar;
        int cevre = 2 * (uzunKenar + kisaKenar);
        System.out.println("Alan: " + alan);
        System.out.println("Çevre: " + cevre);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secim;
        String menu = "1- Toplama İşlemi\n" + "2- Çıkarma İşlemi\n" + "3- Çarpma İşlemi\n" + "4- Bölme işlemi\n" + "5- Üslü Sayı Hesaplama\n" + "6- Faktoriyel Hesaplama\n" + "7- Mod Alma\n" + "8- Dikdörtgen Alan ve Çevre Hesabı\n" + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            secim = scan.nextInt();
            switch (secim) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usluSayi();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    modAlma();
                    break;
                case 8:
                    dikdortgenHesapla();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (secim != 0);
    }
}
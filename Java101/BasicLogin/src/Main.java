import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password, newPass;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullancı Adınız : ");
        username = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş yaptınız ");
        } else {
            System.out.print("Bilgileriniz Yanlış ! ");

            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
            String cevap = inp.nextLine();
            switch (cevap) {
                case "evet":
                    System.out.print("Yeni Şifrenizi Giriniz:");
                    newPass = inp.nextLine();
                    if (newPass.equals("java123")) {
                        System.out.println("Şifreniz Eski Şifrenizle Aynı Olamaz");
                    } else {
                        System.out.println("Yeni Şifreniz Belirlenmiştir Tekrar Giriş Yapınız");
                        break;
                    }
                case "hayır":
                    System.out.println("Tekrar Deneyiniz.");
                    break;
            }


        }
    }
}
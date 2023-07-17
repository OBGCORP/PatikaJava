import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;
        Scanner scanner = new Scanner(System.in);
        int untilLock = 3;
        int selection;
        int balance = 25800;


        while (untilLock > 0) {
            System.out.print("Kullanıcı Adınız :");
            username = scanner.nextLine();
            System.out.print("Parolanız : ");
            password = scanner.nextLine();
            if (username.equals("Patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz.");
                do {
                    System.out.println("1-Para yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak isteğiniz işlemi seçiniz.");
                    selection = scanner.nextInt();
                    switch (selection) {
                        case 1:
                            System.out.print("Para miktarı:");
                            int price = scanner.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı:");
                            int pric = scanner.nextInt();
                            if (pric > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= pric;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                } while (selection != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                untilLock--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (untilLock == 0) {
                    System.out.println("hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");

                } else {
                    System.out.println("Kalan Hakkınız:" + untilLock);
                }
            }
        }
    }
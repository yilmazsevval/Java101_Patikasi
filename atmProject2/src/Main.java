import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı adınız: ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz! ");
                do {
                    System.out.println("1. Para Yatırma\n" +
                            "2. Para Çekme\n" +
                            "3. Bakiye Sorgula\n" +
                            "4. Çıkış Yap. ");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz. ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz para miktarını giriniz: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz para miktarını giriniz: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz. ");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }

                } while (select != 4);
                System.out.println("Tekrar Görüşmek üzere! ");
                break;

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz. ");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz. ");
                } else {
                    System.out.println("Kalan hakkınız: " + right);
                }
            }
        }
    }
}
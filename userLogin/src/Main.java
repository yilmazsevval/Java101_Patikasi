import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, passsword, changePassword, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        passsword = input.nextLine();

        if (userName.equals("deneme") && (passsword.equals("java123"))){
            System.out.println("Giriş Yaptınız! ");
        }else{
            System.out.println("Bilgileriniz Yanlış! ");
            System.out.print("Şifrenizi değiştirmek ister misiniz? (Evet / Hayır şeklinde cevap veriniz): ");
            changePassword = input.nextLine();

            if(changePassword.equals("Evet")){
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = input.nextLine();

                if(newPassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                }else{
                    System.out.println("Şifre oluşturuldu.");
                }

            }else{
                System.out.println("Tekrar deneyin. ");
            }

        }


    }
}
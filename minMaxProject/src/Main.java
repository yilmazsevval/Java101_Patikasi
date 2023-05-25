import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int n = input.nextInt();

        System.out.print("1. Sayıyı Giriniz: ");
        int number = input.nextInt();
        int min = number;
        int max = number;

        int count = 2;
        for (int i = 1; i <= n-1; i++) {
            System.out.print(count + ". Sayıyı Giriniz: ");
            number = input.nextInt();

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
            count++;
        }

        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}
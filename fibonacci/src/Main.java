import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman Sayısı Giriniz: ");
        int number = input.nextInt();
        int a = 0; // İlk Fibonacci sayısı
        int b = 1; // İkinci Fibonacci sayısı

        System.out.print("Fibonacci Dizisi:");
        System.out.print(a);

        for (int i = 2; i <= number; i++) {
            int total = a + b;
            System.out.print(" " + total);

            a = b;
            b = total;
        }
    }
}
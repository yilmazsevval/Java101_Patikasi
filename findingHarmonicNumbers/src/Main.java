import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        double total=0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        number = input.nextInt();

        for (double i=1; i<=number; i++){
            total += (1 / i);
        }
        System.out.println("Sonuç: " + total);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int total = 0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Bir sayı giriniz: " );
            number = input.nextInt();
            if (number % 4 == 0) {
                total = total + number;
            }
        }while (number % 2 ==0);

        System.out.println("Toplam: " + total);
    }
}
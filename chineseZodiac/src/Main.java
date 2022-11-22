import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int dogumYili, zodiac;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        dogumYili = input.nextInt();

        zodiac = dogumYili % 12;

        if(zodiac == 0){
            System.out.println("Çin Zodyağı Burcunuz: Aslan");
        } else if (zodiac == 1) {
            System.out.println("Çin Zodyağı Burcunuz: Horoz");
        }else if (zodiac == 2) {
            System.out.println("Çin Zodyağı Burcunuz: Köpek");
        }else if (zodiac == 3) {
            System.out.println("Çin Zodyağı Burcunuz: Domuz");
        }else if (zodiac == 4) {
            System.out.println("Çin Zodyağı Burcunuz: Fare");
        }else if (zodiac == 5) {
            System.out.println("Çin Zodyağı Burcunuz: Öküz");
        }else if (zodiac == 6) {
            System.out.println("Çin Zodyağı Burcunuz: Kaplan");
        }else if (zodiac == 7) {
            System.out.println("Çin Zodyağı Burcunuz: Tavşan");
        }else if (zodiac == 8) {
            System.out.println("Çin Zodyağı Burcunuz: Ejderha");
        }else if (zodiac == 9) {
            System.out.println("Çin Zodyağı Burcunuz: Yılan");
        }else if (zodiac == 10) {
            System.out.println("Çin Zodyağı Burcunuz: At");
        }else if (zodiac == 11) {
            System.out.println("Çin Zodyağı Burcunuz: Koyun");
        }
    }
}
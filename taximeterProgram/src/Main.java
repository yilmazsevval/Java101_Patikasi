import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, tutar, odenecekTutar;
        double herKmUcreti = 2.20;
        int acilisUcreti = 10;

        Scanner mesafe = new Scanner(System.in);
        System.out.print("Mesafeyi KM Cinsinden Giriniz: ");
        km = mesafe.nextDouble();

        tutar = (acilisUcreti + (km*herKmUcreti));
        odenecekTutar = tutar>20 ? tutar : 20;
        System.out.println("Ödenecek tutar: " + odenecekTutar);

    }
}
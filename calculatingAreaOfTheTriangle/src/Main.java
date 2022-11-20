import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a, b, c, u, ucgeninAlani;

        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz: ");
        a = girdi.nextDouble();
        System.out.print("2. Kenarı Giriniz: ");
        b = girdi.nextDouble();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs hesaplandı: " + c);

        //üçgenin çevresinin yarısı
        u = ((a+b+c)/2);
        ucgeninAlani = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Üçgenin alanı: " + ucgeninAlani);




    }
}
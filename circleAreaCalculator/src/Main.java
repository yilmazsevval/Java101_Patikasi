import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double yariCap, cevre, alan;
        double pi = 3.14;
        double alfa, daireDilimininAlani;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        yariCap = input.nextDouble();

        cevre = (2 * pi * yariCap);
        System.out.println("Dairenin Çevresi: " + cevre);
        alan = (pi * yariCap * yariCap);
        System.out.println("Dairenin Alanı: " + alan);

        Scanner olcu = new Scanner(System.in);
        System.out.print("Daire Diliminin Merkez Açısını Giriniz: ");
        alfa = olcu.nextDouble();

        daireDilimininAlani = (pi * (yariCap * yariCap) * alfa) / 360;
        System.out.println("Daire Diliminin Alanı: " + daireDilimininAlani);


    }
}
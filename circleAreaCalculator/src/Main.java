import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double yariCap, cevre, alan;
        double pi = 3.14;
        double alfa, daireDilimininAlani;

        //Dairenin yarıçapını kullanıcıdan isteyelim
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        yariCap = input.nextDouble();

        //Dairenin alan ve çevre hesabı
        cevre = (2 * pi * yariCap);
        System.out.println("Dairenin Çevresi: " + cevre);
        alan = (pi * yariCap * yariCap);
        System.out.println("Dairenin Alanı: " + alan);

        //Daire diliminin merkez açısını kullanıcıdan isteyelim
        Scanner aci = new Scanner(System.in);
        System.out.print("Daire Diliminin Merkez Açısını Giriniz: ");
        alfa = aci.nextDouble();

        //Daire diliminin alan hesabı
        daireDilimininAlani = (pi * (yariCap * yariCap) * alfa) / 360;
        System.out.println("Daire Diliminin Alanı: " + daireDilimininAlani);


    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy, kilo, vucutKitleIndeksi;

        //Kullanıcıdan boy ve kilosunu isteyelim
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input2.nextDouble();

        //Vücut kitle indeksini hesaplayalım
        vucutKitleIndeksi = (kilo / (boy * boy));
        System.out.println("Vücut Kitle İndeksiniz: " + vucutKitleIndeksi);

    }
}
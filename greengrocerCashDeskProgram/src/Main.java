import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut, elma, domates, muz, patlican, toplamTutar;
        double armutFiyati = 2.14;
        double elmaFiyati = 3.67;
        double domatesFiyati = 1.11;
        double muzFiyati = 0.95;
        double patlicanFiyati = 5.00;

        //Kullanıcıdan kaç kg meyve aldığını isteyelim
        Scanner input = new Scanner (System.in);
        System.out.print("Kaç kilo armut aldınız: ");
        armut = input.nextDouble();
        System.out.print("Kaç kilo elma aldınız: ");
        elma = input.nextDouble();
        System.out.print("Kaç kilo domates aldınız: ");
        domates = input.nextDouble();
        System.out.print("Kaç kilo muz aldınız: ");
        muz = input.nextDouble();
        System.out.print("Kaç kilo patlıcan aldınız: ");
        patlican = input.nextDouble();

        //Meyvelerin ne kadar tuttuğunu hesaplayalım
        armutFiyati *= armut;
        elmaFiyati *= elma;
        domatesFiyati *= domates;
        muzFiyati *= muz;
        patlicanFiyati *= patlican;

        toplamTutar = armutFiyati + elmaFiyati + domatesFiyati + muzFiyati + patlicanFiyati;
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");

    }
}
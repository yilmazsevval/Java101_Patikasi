import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double  matematik;
        double fizik;
        double kimya;
        double turkce;
        double tarih;
        double muzik;

        System.out.print("Matematik notunu giriniz: ");
        matematik = input.nextDouble();

        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextDouble();

        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextDouble();

        System.out.print("Türkçe notunu giriniz: ");
        turkce = input.nextDouble();

        System.out.print("Tarih notunu giriniz: ");
        tarih = input.nextDouble();

        System.out.print("Müzik notunu giriniz: ");
        muzik = input.nextDouble();

        double toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6.0;
        System.out.println("Ortalamanız: " + ortalama);

        String sonuc = ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);

    }
}
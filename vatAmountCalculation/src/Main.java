import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double tutar;
        double kdvOran1 = 0.18;
        double kdvOran2 = 0.8;
        double kdvOran3;
        double kdvTutar;
        double kdvliTutar;

        System.out.print("Tutar giriniz: ");
        tutar = input.nextDouble();

        kdvTutar = tutar>0 && tutar<1000 ? tutar*kdvOran1 : tutar*kdvOran2;
        kdvliTutar = tutar + kdvTutar;
        kdvOran3 = tutar>0 && tutar<1000 ? kdvOran1 : kdvOran2;

                System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOran3);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);



    }
}
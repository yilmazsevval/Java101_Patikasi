import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, ort, sayac=0, toplam=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        a = input.nextInt();


        for(int i=1; i<=a ; i++){
            if(i % 3 == 0 && i % 4 == 0 ){
                toplam = toplam + i;
                sayac = sayac + 1;
            }
        }
        ort = toplam / sayac;
        System.out.println("Ortalama: " + ort);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int matematik, fizik, turkce, kimya, muzik;
        double passingGrade;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();
        if(matematik<0 || matematik>100){
            matematik = 0;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        if(fizik<0 || fizik>100){
            fizik = 0;
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        if(turkce<0 || turkce>100){
            turkce = 0;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        if(kimya<0 || kimya>100){
            kimya = 0;
        }

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        if(muzik<0 || muzik>100){
            muzik = 0;
        }

        passingGrade = ((matematik+fizik+turkce+kimya+muzik) / 5.0);

        if (passingGrade>55){
            System.out.println("Ortalamanız: " + passingGrade + " Tebrikler! Sınıfı Geçtiniz. ");
        }else{
            System.out.println("Ortalamanız: " + passingGrade + " Maalesef Sınıfta Kaldınız. ");
        }


    }
}
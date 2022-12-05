import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("Sınır Sayısını Giriniz: ");
        num = input.nextInt();

        for (int i=1; i<=num; i*=4){
            System.out.println("4' ün kuvvetleri: " + i);
        }

        for (int j=1; j<=num; j*=5 ){
            System.out.println("5' in kuvvetleri: " + j);
        }
    }
}
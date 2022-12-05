import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r, nFac=1, rFac=1, diffFac=1, combination;
        Scanner input = new Scanner(System.in);

        System.out.print("Kümenin eleman sayısını giriniz: ");
        n = input.nextInt();
        for (int i=1; i<=n; i++){
            nFac *= i;
        }

        System.out.print("Alt kümelerin eleman sayısını giriniz: ");
        r = input.nextInt();
        for (int j=1; j<=r; j++){
            rFac *= j;
        }

        if (n > r){
            int diff = n - r;
            for (int k=1; k<=diff; k++){
                diffFac *= k;
            }
            combination = nFac / (rFac * diffFac);
            System.out.println("Kombinasyon: " + combination);

        }else{
            System.out.println("Kümenin eleman sayısı, alt kümelerin eleman sayısından büyük olmalıdır. Tekrar deneyiniz! ");
        }

    }
}
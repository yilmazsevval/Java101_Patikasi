import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        heat = input.nextInt();

        if(heat<5){
            System.out.println(heat + " Derece sıcaklıkta kayak yapabilirsiniz.");
        }else if(heat<=15){
            System.out.println(heat + " Derece sıcaklıkta sinemaya gidebilirsiniz.");
        }else if(heat<=25){
            System.out.println(heat + " Derece sıcaklıkta piknik yapabilirsiniz.");
        }else {
            System.out.println(heat + " Derece sıcaklıkta yüzmeye gidebilirsiniz.");
        }
    }
}
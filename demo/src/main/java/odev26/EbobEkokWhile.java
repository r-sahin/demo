package odev26;

import java.util.Scanner;

public class EbobEkokWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = input.nextInt();

        int a = n1;
        int b = n2;
        while (b != 0) {
            int gecici = b;
            b = a % b;
            a = gecici;
        }
        int ebob = a;

        int ekok = (n1 * n2) / ebob;

        System.out.println("EBOB(" + n1 + "," + n2 + ") = " + ebob);
        System.out.println("EKOK(" + n1 + "," + n2 + ") = " + ekok);
    }
}

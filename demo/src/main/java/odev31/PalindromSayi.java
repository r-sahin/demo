package odev31;

import java.util.Scanner;

public class PalindromSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        if (isPalindrom(sayi)) {
            System.out.println(sayi + " bir palindrom sayıdır.");
        } else {
            System.out.println(sayi + " bir palindrom sayı değildir.");
        }
        input.close();
    }


    public static boolean isPalindrom(int sayi) {
        int orijinal = sayi;
        int ters = 0;
        int gecici = sayi;

        while (gecici > 0) {
            int basamak = gecici % 10;
            ters = ters * 10 + basamak;
            gecici /= 10;
        }
        return orijinal == ters;
    }
}

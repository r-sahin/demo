package odev41;

import java.util.Scanner;

public class EnYakinSayi {
    public static void main(String[] args) {
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner input = new Scanner(System.in);
        System.out.print("Girilen Sayı : ");
        int sayi = input.nextInt();

        int enKucukBuyuk = Integer.MAX_VALUE;
        int enBuyukKucuk = Integer.MIN_VALUE;

        for (int eleman : dizi) {
            if (eleman > sayi && eleman < enKucukBuyuk) {
                enKucukBuyuk = eleman;
            }
            if (eleman < sayi && eleman > enBuyukKucuk) {
                enBuyukKucuk = eleman;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + enBuyukKucuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + enKucukBuyuk);
    }
}

package odev27;

import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Geçerli bir sayı adedi giriniz.");
            return;
        }

        System.out.print("1. Sayıyı giriniz: ");
        int sayi = input.nextInt();
        int enKucuk = sayi;
        int enBuyuk = sayi;

        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = input.nextInt();
            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}

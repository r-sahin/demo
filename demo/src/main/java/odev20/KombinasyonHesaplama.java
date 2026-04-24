package odev20;

import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        int n = input.nextInt();
        System.out.print("r değerini giriniz: ");
        int r = input.nextInt();

        if (n < r || n < 0 || r < 0) {
            System.out.println("Geçersiz giriş! n >= r >= 0 olmalıdır.");
        } else {
            long kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
            System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
        }

        input.close();
    }

    public static long faktoriyel(int sayi) {
        long sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        return sonuc;
    }
    }


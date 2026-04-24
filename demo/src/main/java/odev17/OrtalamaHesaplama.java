package odev17;

import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        int toplam = 0;
        int adet = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }

        if (adet == 0) {
            System.out.println("0 ile " + n + " arasında 3 ve 4'e tam bölünen sayı bulunmamaktadır.");
        } else {
            double ortalama = (double) toplam / adet;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        }

        input.close();
    }
}

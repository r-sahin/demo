package odev10;

import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] dersler = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};
        double toplam = 0;
        int gecerliDersSayisi = 0;

        for (String ders : dersler) {
            System.out.print(ders + " notunu giriniz: ");
            double not = input.nextDouble();

            if (not >= 0 && not <= 100) {
                toplam += not;
                gecerliDersSayisi++;
            } else {
                System.out.println(ders + " notu geçersiz (0-100 arası olmalı), ortalamaya dahil edilmedi.");
            }
        }

        double ortalama = (gecerliDersSayisi == 0) ? 0 : (toplam / gecerliDersSayisi);

        System.out.println("Not Ortalaması: " + ortalama);
        String sonuc = (ortalama >= 55) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);

        input.close();
    }
}

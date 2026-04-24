package odev7;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        System.out.print("Armut Kaç Kilo ? :");
        double armutKg = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        double elmaKg = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        double domatesKg = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        double muzKg = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        double patlicanKg = input.nextDouble();

        double toplam = (armutKg * armutFiyat) + (elmaKg * elmaFiyat) +
                (domatesKg * domatesFiyat) + (muzKg * muzFiyat) +
                (patlicanKg * patlicanFiyat);

        System.out.printf("Toplam Tutar : %.2f TL", toplam);
        input.close();

    }
}

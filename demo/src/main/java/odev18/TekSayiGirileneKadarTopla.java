package odev18;

import java.util.Scanner;

public class TekSayiGirileneKadarTopla {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int toplam = 0;
        int sayi;

        System.out.println("Tek bir sayı girilene kadar program devam edecektir.");
        System.out.println("Girilen sayılardan 4'ün katı olanlar toplanacaktır.");

        while (true) {
            System.out.print("Bir sayı giriniz: ");
            sayi = input.nextInt();

            if (sayi % 2 == 1) {
                break;
            }

            if (sayi % 4 == 0) {
                toplam += sayi;
            }
        }

        System.out.println("Girilen sayılardan 4'ün katı olanların toplamı: " + toplam);
        input.close();
    }
}

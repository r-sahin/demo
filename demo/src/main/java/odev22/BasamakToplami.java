package odev22;

import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        int toplam = 0;
        int gecici = Math.abs(sayi);

        while (gecici != 0) {
            toplam += gecici % 10;
            gecici /= 10;
        }

        System.out.println("Basamak sayılarının toplamı: " + toplam);
        input.close();
    }
}

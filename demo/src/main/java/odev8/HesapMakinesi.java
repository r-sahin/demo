package odev8;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yapmak istediğiniz işlemi giriniz (+, -, *, /): ");
        char islem = scanner.next().charAt(0);

        System.out.print("Birinci sayıyı giriniz: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        double sayi2 = scanner.nextDouble();

        double sonuc;
        boolean gecerliIslem = true;

        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                System.out.printf("%.2f + %.2f = %.2f%n", sayi1, sayi2, sonuc);
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                System.out.printf("%.2f - %.2f = %.2f%n", sayi1, sayi2, sonuc);
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                System.out.printf("%.2f * %.2f = %.2f%n", sayi1, sayi2, sonuc);
                break;
            case '/':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                    System.out.printf("%.2f / %.2f = %.2f%n", sayi1, sayi2, sonuc);
                } else {
                    System.out.println("Hata: Bir sayı sıfıra bölünemez!");
                    gecerliIslem = false;
                }
                break;
            default:
                System.out.println("Geçersiz işlem! Lütfen +, -, *, / işlemlerinden birini seçin.");
                gecerliIslem = false;
                break;
        }

        scanner.close();
    }
}

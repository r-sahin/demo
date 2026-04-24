package odev9;

import java.util.Scanner;

public class SifreYenileme {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String eskiSifre = "1234";
        boolean sifreDogruMu = false;

        System.out.print("Şifrenizi giriniz: ");
        String girilenSifre = scanner.nextLine();

        if (girilenSifre.equals(eskiSifre)) {
            System.out.println("Hoş geldiniz!");
            sifreDogruMu = true;
        } else {
            System.out.println("Şifre yanlış!");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (E/H): ");
            String cevap = scanner.nextLine();

            if (cevap.equalsIgnoreCase("E")) {

                boolean sifreOlusturuldu = false;
                while (!sifreOlusturuldu) {
                    System.out.print("Yeni şifrenizi giriniz: ");
                    String yeniSifre = scanner.nextLine();

                    if (yeniSifre.equals(eskiSifre)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        eskiSifre = yeniSifre;
                        System.out.println("Şifre oluşturuldu.");
                        sifreOlusturuldu = true;
                        sifreDogruMu = true;
                    }
                }
            } else {
                System.out.println("Şifre sıfırlanmadı. Program sonlanıyor.");
            }
        }

        if (sifreDogruMu) {
            System.out.println("İşlemlere devam edebilirsiniz.");
        }
        scanner.close();

    }
}

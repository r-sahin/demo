package odev14;

import java.util.Scanner;

public class UcakBiletiFiyatHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        double mesafe = input.nextDouble();
        System.out.print("Yaşınızı giriniz : ");
        int yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int tip = input.nextInt();


        if (mesafe <= 0 || yas <= 0 || (tip != 1 && tip != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            double normalTutar = mesafe * 0.10;
            double indirimliTutar = normalTutar;


            if (yas < 12) {
                indirimliTutar = normalTutar * 0.5;
            } else if (yas <= 24) {
                indirimliTutar = normalTutar * 0.9;
            } else if (yas > 65) {
                indirimliTutar = normalTutar * 0.7;
            }


            if (tip == 2) {
                indirimliTutar = indirimliTutar * 0.8;
                double toplamTutar = indirimliTutar * 2;
                System.out.println("Toplam Tutar = " + toplamTutar + " TL");
            } else {
                System.out.println("Toplam Tutar = " + indirimliTutar + " TL");
            }
        }
        input.close();
    }
}

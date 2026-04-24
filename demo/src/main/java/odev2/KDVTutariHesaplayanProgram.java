package odev2;

import java.util.Scanner;

public class KDVTutariHesaplayanProgram {
    public static  void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Para değerini TL cinsinden giriniz: ");
        double tutar = input.nextDouble();

        double kdvOrani;
        if(tutar>=0 && tutar<=1000)
        {
            kdvOrani = 0.18;
        }
        else {
            kdvOrani = 0.08;
        }

        double kdvTutari = tutar * kdvOrani;
        double kdvliFiyat = tutar + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + tutar + " TL");
        System.out.println("KDV Oranı: %" + (int)(kdvOrani * 100));
        System.out.println("KDV Tutarı: " + kdvTutari + " TL");
        System.out.println("KDV'li Fiyat: " + kdvliFiyat + " TL");

    }
}

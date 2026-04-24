package odev1;

import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu girin: ");
        double matematik = input.nextDouble();

        System.out.print("Fizik notunuzu girin: ");
        double fizik = input.nextDouble();

        System.out.print("Kimya notunuzu girin: ");
        double kimya = input.nextDouble();

        System.out.print("Türkçe notunuzu girin: ");
        double turkce = input.nextDouble();

        System.out.print("Tarih notunuzu girin: ");
        double tarih = input.nextDouble();

        System.out.print("Müzik notunuzu girin: ");
        double muzik = input.nextDouble();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.println("Not Ortalaması: " + ortalama);

        String sonuc = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);


    }

}

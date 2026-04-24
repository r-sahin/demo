package odev4;

import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen mesafeyi kilometre cinsinden giriniz: ");
        double mesafe = input.nextDouble();

        double acilisUcreti = 10.0;
        double kmBasinaUcret = 2.20;
        double minOdenecekTutar = 20.0;

        double toplam = acilisUcreti + (mesafe * kmBasinaUcret);

        double odenecekTutar = (toplam < minOdenecekTutar) ? minOdenecekTutar : toplam;

        System.out.println("Taksimetre Tutarı: " + odenecekTutar + " TL");

        input.close();
    }
}

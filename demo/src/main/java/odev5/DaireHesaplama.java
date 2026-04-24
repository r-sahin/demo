package odev5;

import java.util.Scanner;

public class DaireHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double PI = 3.14;

        System.out.print("Dairenin yarıçapını (r) giriniz: ");
        double r = input.nextDouble();

        System.out.print("Daire diliminin merkez açısını (α) derece cinsinden giriniz: ");

        double aci = input.nextDouble();

        double alan = PI * r * r;
        double cevre = 2 * PI * r;

        double dilimAlani = (PI * r * r * aci) / 360;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
        System.out.println(aci + " derecelik daire diliminin Alanı: " + dilimAlani);

        input.close();
    }
}

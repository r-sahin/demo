package odev3;

import java.util.Scanner;

public class UcgenAlanHesaplama {
    public static  void main (String[]args)
    {
        Scanner input = new Scanner(System.in);


        System.out.print("Birinci kenar uzunluğunu giriniz (a): ");
        double a = input.nextDouble();

        System.out.print("İkinci kenar uzunluğunu giriniz (b): ");
        double b = input.nextDouble();

        System.out.print("Üçüncü kenar uzunluğunu giriniz (c): ");
        double c = input.nextDouble();

        double u = (a+b+c)/2;

        double alanKAre = u * (u - a) * (u - b) * (u - c);

        if (alanKAre <= 0) {
            System.out.println("Geçersiz üçgen kenarları! Üçgen eşitsizliğine uygun değerler giriniz.");
        }
        else {
            double alan = Math.sqrt(alanKAre);
            System.out.println("Üçgenin alanı: " + alan);
        }

        input.close();


    }
}

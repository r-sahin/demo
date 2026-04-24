package odev23;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N sayısını giriniz: ");
        int n = input.nextInt();

        double toplam = 0.0;

        for (int i = 1; i <= n; i++) {
            toplam += 1.0 / i;
        }

        System.out.println("Harmonik seri toplamı: " + toplam);
        input.close();
    }
}

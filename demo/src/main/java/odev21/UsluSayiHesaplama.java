package odev21;

import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        int taban = input.nextInt();
        System.out.print("Üs değerini giriniz (pozitif tam sayı): ");
        int us = input.nextInt();

        long sonuc = 1;


        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        System.out.println(taban + "^" + us + " = " + sonuc);
        input.close();
    }
}

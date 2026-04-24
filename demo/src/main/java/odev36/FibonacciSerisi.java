package odev36;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç elemanlı Fibonacci serisi istiyorsunuz? ");
        int elemanSayisi = input.nextInt();

        int ilk = 0, ikinci = 1;

        System.out.print(elemanSayisi + " Elemanlı Fibonacci Serisi : ");
        for (int i = 1; i <= elemanSayisi; i++) {
            System.out.print(ilk + " ");
            int sonraki = ilk + ikinci;
            ilk = ikinci;
            ikinci = sonraki;
        }
        input.close();
    }
}

package odev19;

import java.util.Scanner;

public class KuvvetleriYazdir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        System.out.println("4'ün kuvvetleri:");
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }

        System.out.println("\n5'in kuvvetleri:");
        for (int i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }

        input.close();
    }
}

package odev44;

import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();

        int[] dizi = new int[n];

        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            dizi[i] = input.nextInt();
        }

        Arrays.sort(dizi);

        System.out.print("Sıralama : ");
        for (int sayi : dizi) {
            System.out.print(sayi + " ");
        }
        input.close();
    }
}

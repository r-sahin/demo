package odev34;

import java.util.Scanner;

public class RecursiveAsal {
    static boolean isAsal(int n, int bolen) {
        if (n <= 1) {
            return false;
        }
        if (bolen == 1) {
            return true;
        }
        if (n % bolen == 0) {
            return false;
        }
        return isAsal(n, bolen - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int sayi = input.nextInt();

        int sinir = (int) Math.sqrt(sayi);
        boolean asalMi = isAsal(sayi, sinir);

        if (asalMi && sayi > 1) {
            System.out.println(sayi + " sayısı ASALDIR !");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir !");
        }

        input.close();
    }
}

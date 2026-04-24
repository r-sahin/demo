package odev33;

import java.util.Scanner;

public class RecursiveUsAlma {
    static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban değeri giriniz : ");
        int base = input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int exp = input.nextInt();

        int result = power(base, exp);
        System.out.println("Sonuç : " + result);
    }
}

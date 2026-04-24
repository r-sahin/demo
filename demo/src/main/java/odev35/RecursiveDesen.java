package odev35;

import java.util.Scanner;

public class RecursiveDesen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int n = input.nextInt();
        recursive(n, n, true);
    }

    public static void recursive(int n, int original, boolean decreasing) {
        System.out.print(n + " ");
        if (!decreasing && n == original) {
            return;
        }
        if (decreasing) {
            if (n <= 0) {
                recursive(n + 5, original, false);
            } else {
                recursive(n - 5, original, true);
            }
        } else {
            recursive(n + 5, original, false);
        }
    }
}


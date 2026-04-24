package odev47;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random rand = new Random();
        int secretNumber = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        int right = 5;
        int[] wrongGuesses = new int[5];
        int wrongIndex = 0;
        boolean isWin = false;

        System.out.println("=== Sayı Tahmin Oyunu ===");
        System.out.println("0-99 arasında bir sayı tuttum. 5 hakkın var!");

        while (right > 0) {
            System.out.print("Tahmininizi girin: ");
            int guess = input.nextInt();

            if (guess < 0 || guess > 99) {
                System.out.println("Lütfen 0-99 arasında bir sayı girin!");
                continue;
            }

            if (guess == secretNumber) {
                isWin = true;
                System.out.println("Tebrikler! Doğru tahmin: " + secretNumber);
                break;
            } else {
                System.out.println("Yanlış tahmin!");
                if (guess > secretNumber) {
                    System.out.println("İpucu: Gizli sayı " + guess + "'ten daha küçük.");
                } else {
                    System.out.println("İpucu: Gizli sayı " + guess + "'ten daha büyük.");
                }
                wrongGuesses[wrongIndex++] = guess;
                right--;
                System.out.println("Kalan hak: " + right);
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz! Gizli sayı: " + secretNumber);
            System.out.print("Tahminleriniz: ");
            for (int i = 0; i < wrongIndex; i++) {
                System.out.print(wrongGuesses[i] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}

package odev40;

public class HarmonikOrtalama {
    public static void main(String[] args) {

        double[] sayilar = {1, 2, 3, 4, 5};

        double harmonikToplam = 0.0;

        for (double sayi : sayilar) {
            harmonikToplam += 1.0 / sayi;
        }

        double harmonikOrtalama = sayilar.length / harmonikToplam;

        System.out.println("Dizinin harmonik ortalaması: " + harmonikOrtalama);
    }
}

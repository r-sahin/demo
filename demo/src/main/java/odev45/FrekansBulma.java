package odev45;

import java.util.HashMap;
import java.util.Map;

public class FrekansBulma {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        Map<Integer, Integer> frekans = new HashMap<>();

        for (int sayi : dizi) {
            frekans.put(sayi, frekans.getOrDefault(sayi, 0) + 1);
        }

        System.out.println("Dizi : " + java.util.Arrays.toString(dizi));
        System.out.println("Tekrar Sayıları");
        for (Map.Entry<Integer, Integer> entry : frekans.entrySet()) {
            System.out.println(entry.getKey() + " sayısı " + entry.getValue() + " kere tekrar edildi.");
        }
    }

}

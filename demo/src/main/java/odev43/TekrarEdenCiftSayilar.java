package odev43;

import java.util.ArrayList;
import java.util.HashSet;

public class TekrarEdenCiftSayilar {
    public static void main(String[] args) {
        int[] dizi = {2, 4, 6, 8, 2, 10, 4, 12, 14, 6, 16, 18, 20, 2, 4};

        ArrayList<Integer> tekrarEdenler = new ArrayList<>();
        HashSet<Integer> gorulenler = new HashSet<>();
        HashSet<Integer> eklenenler = new HashSet<>();

        for (int sayi : dizi) {
            if (sayi % 2 == 0) {
                if (gorulenler.contains(sayi)) {
                    if (!eklenenler.contains(sayi)) {
                        tekrarEdenler.add(sayi);
                        eklenenler.add(sayi);
                    }
                } else {
                    gorulenler.add(sayi);
                }
            }
        }

        if (tekrarEdenler.isEmpty()) {
            System.out.println("Tekrar eden çift sayı bulunamadı.");
        } else {
            System.out.println("Tekrar eden çift sayılar: " + tekrarEdenler);
        }
    }
}


package odev11;

import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklığı giriniz (°C): ");
        int sicaklik = input.nextInt();
        String etkinlik = sicaklik < 5 ? "Kayak yapabilirsiniz." :
                (sicaklik <= 15 ? "Sinemaya gidebilirsiniz." :
                        (sicaklik <= 25 ? "Piknik yapabilirsiniz." :
                                "Yüzmeye gidebilirsiniz."));

        System.out.println(etkinlik);
        input.close();
    }
}

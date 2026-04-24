package odev46;

public class MatrisTranspozu {
    public static void main(String[] args) {
        int[][] matris1 = {
                {2, 3, 4},
                {5, 6, 4}
        };
        int[][] matris2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Matris : ");
        matrisYazdir(matris1);
        System.out.println("Transpoze : ");
        matrisYazdir(transpoz(matris1));

        System.out.println("\nMatris : ");
        matrisYazdir(matris2);
        System.out.println("Transpoze : ");
        matrisYazdir(transpoz(matris2));
    }

    public static int[][] transpoz(int[][] matris) {
        int satir = matris.length;
        int sutun = matris[0].length;
        int[][] transpoz = new int[sutun][satir];

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }
        return transpoz;
    }

    // Matrisi ekrana yazdırır
    public static void matrisYazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + "    ");
            }
            System.out.println();
        }
    }
}

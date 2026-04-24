package odev42;

public class BHarfiYazdir {
    public static void main(String[] args) {

        String[][] bHarfi = new String[7][4];

        for (int i = 0; i < bHarfi.length; i++) {
            for (int j = 0; j < bHarfi[i].length; j++) {
                bHarfi[i][j] = " ";
            }
        }


        for (int satir = 0; satir < 7; satir++) {
            for (int sutun = 0; sutun < 4; sutun++) {
                if (satir == 0 || satir == 3 || satir == 6) {
                    bHarfi[satir][sutun] = "*";
                } else if (sutun == 0 || sutun == 3) {
                    bHarfi[satir][sutun] = "*";
                }
            }
        }

        for (int i = 0; i < bHarfi.length; i++) {
            for (int j = 0; j < bHarfi[i].length; j++) {
                System.out.print(bHarfi[i][j] + " ");
            }
            System.out.println();
        }
    }
}

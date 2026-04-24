package odev49;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private String[][] mineMap;
    private String[][] gameBoard;
    private boolean[][] revealed;
    private int rows, cols;
    private int mineCount;
    private int totalCells;
    private int openedCells;
    private boolean gameOver;

    public MineSweeper(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.totalCells = rows * cols;
        this.mineCount = totalCells / 4;
        this.mineMap = new String[rows][cols];
        this.gameBoard = new String[rows][cols];
        this.revealed = new boolean[rows][cols];
        this.openedCells = 0;
        this.gameOver = false;
    }

    private void placeMines() {
        Random rand = new Random();
        int placedMines = 0;
        while (placedMines < mineCount) {
            int r = rand.nextInt(rows);
            int c = rand.nextInt(cols);
            if (mineMap[r][c] == null) {
                mineMap[r][c] = "*";
                placedMines++;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mineMap[i][j] == null) {
                    mineMap[i][j] = "0";
                }
            }
        }
    }

    private void calculateNeighbors() {
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mineMap[i][j].equals("*")) continue;
                int count = 0;
                for (int d = 0; d < 8; d++) {
                    int ni = i + dx[d];
                    int nj = j + dy[d];
                    if (ni >= 0 && ni < rows && nj >= 0 && nj < cols && mineMap[ni][nj].equals("*")) {
                        count++;
                    }
                }
                mineMap[i][j] = String.valueOf(count);
            }
        }
    }

    private void initGameBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                gameBoard[i][j] = "-";
            }
        }
    }

    private void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void printMineLocations() {
        System.out.println("Mayınların Konumu");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print((mineMap[i][j].equals("*") ? "*" : "-") + " ");
            }
            System.out.println();
        }
    }

    private void revealCell(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) return;
        if (revealed[row][col]) return;

        revealed[row][col] = true;
        openedCells++;
        gameBoard[row][col] = mineMap[row][col]; // sayı veya mayın

        // Eğer etrafındaki mayın sayısı 0 ise, komşuları da aç
        if (mineMap[row][col].equals("0")) {
            int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
            int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
            for (int d = 0; d < 8; d++) {
                int ni = row + dx[d];
                int nj = col + dy[d];
                if (ni >= 0 && ni < rows && nj >= 0 && nj < cols && !revealed[ni][nj]) {
                    revealCell(ni, nj);
                }
            }
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        placeMines();
        calculateNeighbors();
        initGameBoard();

        System.out.println("===========================");
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        printBoard();

        while (!gameOver) {
            System.out.print("Satır Giriniz : ");
            int row = scanner.nextInt();
            System.out.print("Sütun Giriniz : ");
            int col = scanner.nextInt();

            // Sınır kontrolü
            if (row < 0 || row >= rows || col < 0 || col >= cols) {
                System.out.println("Hatalı koordinat! Lütfen geçerli bir satır ve sütun girin.");
                continue;
            }

            // Daha önce açılmış mı?
            if (revealed[row][col]) {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
                continue;
            }

            // Mayına bastı mı?
            if (mineMap[row][col].equals("*")) {
                System.out.println("Game Over!!");
                gameOver = true;
                // Kaybedince mayınları göster
                System.out.println("Mayınların Konumu");
                printMineLocations();
                break;
            }

            // Mayın yoksa, hücreyi aç
            revealCell(row, col);
            System.out.println("===========================");
            printBoard();

            // Kazanma koşulu: Mayınlar dışındaki tüm hücreler açıldı mı?
            if (openedCells == totalCells - mineCount) {
                System.out.println("Oyunu Kazandınız !");
                gameOver = true;
                break;
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, cols;

        while (true) {
            System.out.print("Satır sayısını giriniz (min 2): ");
            rows = scanner.nextInt();
            System.out.print("Sütun sayısını giriniz (min 2): ");
            cols = scanner.nextInt();
            if (rows >= 2 && cols >= 2) {
                break;
            } else {
                System.out.println("En az 2x2 boyutunda bir matris giriniz!");
            }
        }

        MineSweeper game = new MineSweeper(rows, cols);
        game.play();
        scanner.close();
    }

}

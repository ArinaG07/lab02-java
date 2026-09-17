package ru.university.lab2.arrays;

public class Task06_Matrices {
    public void run() {

        int[][] matrix = {{1, 22, 3}, {4, 5, 66}, {7, 8, 9}};

        for (int[] row : matrix) {
            for (int x : row) {
                System.out.print(x + "\t");
            }
            System.out.println();
        }

        int[][] t = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                t[j][i] = matrix[i][j];
            }
        }

        System.out.println("Транспонированная матрица:");

        for (int[] row : t) {
            for (int x : row) {
                System.out.print(x + "\t");
            }
            System.out.println();
        }

        int[][] m1 = {{1, 2}, {3, 4}};
        int[][] m2 = {{5, 6}, {7, 8}};

        if (m1[0].length != m2.length) {
            System.out.println("Матрицы несогласованы по размерам!");

        } else {
            int[][] res = new int[m1.length][m2[0].length];
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m2[0].length; j++) {
                    for (int k = 0; k < m1[0].length; k++) {
                        res[i][j] += m1[i][k] * m2[k][j];
                    }
                }
            }

            System.out.println("Результат умножения матриц:");
            for (int[] row : res) {
                for (int x : row) {
                    System.out.print(x + "\t");
                }
                System.out.println();
            }
        }
    }

}

package ru.university.lab2.arrays;

public class Task05_Arrays {
    public void run() {
        int[] arr = new int[10];
        long seed = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            seed = (seed * 1103515245 + 12345) & 0x7fffffff;
            arr[i] = (int) (seed % 100);
        }

        int min = arr[0], max = arr[0], sum = 0;
        for (int x : arr) {
            if (x < min) min = x;
            if (x > max) max = x;
            sum += x;
        }
        System.out.println("Характеристики: min = " + min + ", max = " + max + ", среднее = " + ((double) sum / arr.length));

        int[] sorted = arr.clone();
        for (int i = 0; i < sorted.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[j] < sorted[minIdx]) minIdx = j;
            }
            int temp = sorted[minIdx]; sorted[minIdx] = sorted[i]; sorted[i] = temp;
        }

        System.out.print("Отсортированный массив: ");
        for (int x : sorted) {
            System.out.print(x + " ");
        }
        System.out.println();

        int[] a1 = {1, 2, 3}, a2 = {1, 2, 3};

        System.out.println("a1 == a2: " + (a1 == a2));
        System.out.println("a1.equals(a2): " + a1.equals(a2));
        boolean elEq = a1.length == a2.length;

        if (elEq) {
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) elEq = false;
            }
        }
        System.out.println("Ручная проверка равенства элементов: " + elEq);
    }
}

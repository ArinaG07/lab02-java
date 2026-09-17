package ru.university.lab2.arrays;

public class Task07_Methods {
    public void run() {
        print(10);
        print(4.5);
        print("Строка");
        print(new int[]{1, 2, 3});

        System.out.println("Вызов varargs с 0 аргументов: " + sumVarArgs());
        System.out.println("Вызов varargs с массивом: " + sumVarArgs(new int[]{2, 4, 6}));

        System.out.println("Итеративно 2^5: " + powIterative(2, 5) + " | Рекурсивно 2^5: " + powRecursive(2, 5));

        System.out.println("Рассуждение: Итеративная реализация работает быстрее. При каждом рекурсивном вызове тратится время на выделение памяти под новый кадр стека (Stack Frame), чего не происходит внутри простого цикла.");
    }

    private void print(int x) { System.out.println("Вызван print(int): " + x); }
    private void print(double d) { System.out.println("Вызван print(double): " + d); }
    private void print(String s) { System.out.println("Вызван print(String): " + s); }
    private void print(int[] arr) {
        System.out.print("Вызван print(int[]): ");

        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    private int sumVarArgs(int... args) {
        int s = 0;
        for (int x : args) s += x;
        return s;
    }

    private int powIterative(int base, int exp) {
        int r = 1;
        for (int i = 0; i < exp; i++) r *= base;
        return r;
    }

    private int powRecursive(int base, int exp) {
        if (exp == 0) return 1;
        return base * powRecursive(base, exp - 1);
    }
}

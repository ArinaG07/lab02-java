package ru.university.lab2.numbers;

public class Task03_Bitwise {
    public void run() {
        int a = 5, b = 3;
        System.out.println("5 & 3 = " + (a & b) + " | 5 | 3 = " + (a | b) + " | 5 ^ 3 = " + (a ^ b));
        System.out.println("~5 = " + (~a) + " | 5 << 1 = " + (a << 1) + " | 5 >> 1 = " + (a >> 1) + " | 5 >>> 1 = " + (a >>> 1));

        int neg = -8;
        System.out.println("-8 >> 1 = " + (neg >> 1) + " | -8 >>> 1 = " + (neg >>> 1));
        System.out.println("Объяснение: оператор >> сохраняет знак числа (заполняет левые биты единицами), а >>> заполняет их нулями.");

        System.out.println("6 четное: " + ((6 & 1) == 0) + ", 7 четное: " + ((7 & 1) == 0));
        System.out.println("16 степень 2: " + (16 > 0 && (16 & (16 - 1)) == 0));

        int n = 7, count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            } n >>>= 1;
        }
        System.out.println("Количество единичных битов в 7: " + count);

        int x = 42, y = 99;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("XOR Swap результат: x = " + x + ", y = " + y);
    }
}

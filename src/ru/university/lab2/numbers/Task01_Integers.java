package ru.university.lab2.numbers;

public class Task01_Integers {
    public void run() {
        System.out.println("Byte min: " + Byte.MIN_VALUE + ", max: " + Byte.MAX_VALUE);
        System.out.println("Short min: " + Short.MIN_VALUE + ", max: " + Short.MAX_VALUE);
        System.out.println("Integer min: " + Integer.MIN_VALUE + ", max: " + Integer.MAX_VALUE);
        System.out.println("Long min: " + Long.MIN_VALUE + ", max: " + Long.MAX_VALUE);

        int overflowRes = Integer.MAX_VALUE + 1;
        System.out.println("Integer.MAX_VALUE + 1 = " + overflowRes);
        System.out.println("Объяснение: произошло циклическое переполнение, результат перешел в минимальное значение.");

        int multInt = Integer.MAX_VALUE * 2;
        long multLong = (long) Integer.MAX_VALUE * 2;
        System.out.println("Integer.MAX_VALUE * 2 в int: " + multInt);
        System.out.println("Integer.MAX_VALUE * 2 в long: " + multLong);
        System.out.println("Объяснение: в int произошел сброс старшего бита из-за переполнения 32-битной сетки, в long диапазона хватило.");

        System.out.println("5 / 2 = " + (5 / 2) + ", -5 / 2 = " + (-5 / 2));
        System.out.println("5 % 2 = " + (5 % 2) + ", -5 % 2 = " + (-5 % 2));
        System.out.println("Объяснение: знак остатка от деления всегда соответствует знаку делимого.");

        long bigVal = Integer.MAX_VALUE + 10L;
        System.out.println("Приведение long " + bigVal + " к int: " + (int) bigVal);
        System.out.println("Объяснение: при сужении типов старшие 32 бита числа long отбрасываются.");

        char nextLetter = (char) ('A' + 1);
        int sumCodes = '1' + '2';
        char sumChar = (char) ('1' + '2');
        System.out.println("Следующая буква за 'A': " + nextLetter);
        System.out.println("'1' + '2' как число: " + sumCodes + ", как символ: " + sumChar);
        System.out.println("Объяснение: char базируется на целочисленных кодах, при сложении происходит приведение к int.");

        int a1 = 2000000000, b1 = 2000000000;
        int a2 = 1000, b2 = 5000;
        System.out.println("Переполнение " + a1 + " + " + b1 + ": " + checkOverflow(a1, b1));
        System.out.println("Переполнение " + a2 + " + " + b2 + ": " + checkOverflow(a2, b2));
    }

    private boolean checkOverflow(int a, int b) {
        if (b > 0 && a > Integer.MAX_VALUE - b) return true;
        if (b < 0 && a < Integer.MIN_VALUE - b) return true;
        return false;
    }
}



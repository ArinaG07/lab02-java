package ru.university.lab2.numbers;

public class Task02_FloatArithmetic {
    public void run() {
        System.out.println("8.1 + 0.2 = " + (8.1 + 0.2));
        System.out.println("Объяснение: результат не равен точно 8.3 из-за невозможности точного представления бесконечных двоичных дробей в памяти double.");

        double sum = 0.0;
        for (int i = 0; i < 10; i++) sum += 0.1;
        System.out.println("10 раз по 0.1 в цикле = " + sum + " (Равно 1.0 через ==: " + (sum == 1.0) + ")");

        double eps = 1e-9;
        double diff = sum - 1.0;
        if (diff < 0) diff = -diff;
        System.out.println("Сравнение через epsilon (" + eps + "): " + (diff < eps));

        double pInf = 1.0 / 0.0;
        double nInf = -1.0 / 0.0;
        double nan = 0.0 / 0.0;
        System.out.println("Infinity: " + pInf + ", -Infinity: " + nInf + ", NaN: " + nan);
        System.out.println("Проверка NaN == NaN: " + (nan == nan));
        System.out.println("Объяснение: согласно стандарту IEEE 754, значение NaN не равно ничему, включая самого себя.");

        double[] vals = {2.7, -2.7};
        for (int i = 0; i < vals.length; i++) {
            double v = vals[i];
            System.out.println("Значение: " + v + " -> (int): " + (int)v + ", round: " + Math.round(v) + ", floor: " + Math.floor(v) + ", ceil: " + Math.ceil(v));
        }

        float fVal = 1.0f / 3.0f;
        double dVal = 1.0 / 3.0;
        System.out.println("1/3 во float: " + fVal + ", в double: " + dVal);
    }
}


package ru.university.lab2;

import java.util.Scanner;
import ru.university.lab2.numbers.Task01_Integers;
import ru.university.lab2.numbers.Task02_FloatArithmetic;
import ru.university.lab2.numbers.Task03_Bitwise;
import ru.university.lab2.strings.Task04_Strings;
import ru.university.lab2.arrays.Task05_Arrays;
import ru.university.lab2.arrays.Task06_Matrices;
import ru.university.lab2.arrays.Task07_Methods;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            String menuText = """
                *** МЕНЮ ***
                1. Целочисленные ловушки
                2. Вещественная арифметика
                3. Побитовые операции
                4. Обработка текста
                5. Одномерные массивы
                6. Многомерные массивы
                7. Методы и передача аргументов
                0. Выход
                """;
            System.out.print(menuText);
            System.out.print("Введите номер задания: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Ошибка: Введено некорректное значение! Введите число.");
                scanner.next();
                choice = -1;
                continue;
            }

            switch (choice) {
                case 0 -> System.out.println("Выход из программы.");
                case 1 -> new Task01_Integers().run();
                case 2 -> new Task02_FloatArithmetic().run();
                case 3 -> new Task03_Bitwise().run();
                case 4 -> new Task04_Strings().run();
                case 5 -> new Task05_Arrays().run();
                case 6 -> new Task06_Matrices().run();
                case 7 -> new Task07_Methods().run();
                default -> System.out.println("Задание с таким номером не найдено.");
            }
            System.out.println("\n---------------------------");
        } while (choice != 0);
    }
}


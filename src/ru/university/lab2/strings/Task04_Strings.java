package ru.university.lab2.strings;

public class Task04_Strings {
    public void run() {
        String pal = "А роза упала на лапу Азора";
        int left = 0, right = pal.length() - 1;
        boolean isPal = true;
        while (left < right) {
            char l = pal.charAt(left);
            char r = pal.charAt(right);

            if (!Character.isLetterOrDigit(l)) left++;
            else if (!Character.isLetterOrDigit(r)) right--;
            else {
                if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                    isPal = false;
                    break;
                }
                left++;
                right--;
            }
        }
        System.out.println("Строка палиндром: " + isPal);

        String wordsStr = "кот съел мышь";
        int spaceCount = 0;

        for (int i = 0; i < wordsStr.length(); i++) {
            if (wordsStr.charAt(i) == ' ') spaceCount++;
        }

        String[] words = new String[spaceCount + 1];
        int wIdx = 0, start = 0;

        for (int i = 0; i < wordsStr.length(); i++) {
            if (wordsStr.charAt(i) == ' ') {
                words[wIdx++] = wordsStr.substring(start, i);
                start = i + 1;
            }
        }

        words[wIdx] = wordsStr.substring(start);
        System.out.print("Разворот слов: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + (i > 0 ? " " : "\n"));
        }

        String cntStr = "Hello Java 2026!";
        int v = 0, c = 0, d = 0, s = 0;

        for (int i = 0; i < cntStr.length(); i++) {
            char ch = cntStr.charAt(i);

            if (ch == ' ') s++;
            else if (Character.isDigit(ch)) d++;
            else if (Character.isLetter(ch)) {
                if ("aeiouAEIOUаеёиоуыэюяАЕЁИОУЫЭЮЯ".indexOf(ch) >= 0) {
                    v++;
                } else c++;
            }
        }
        System.out.println("Гласных: " + v + ", Согласных: " + c + ", Цифр: " + d + ", Пробелов: " + s);

        String original = "Hello-World";
        char[] buf = new char[original.length()];

        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                buf[i] = (char) ('a' + (ch - 'a' + 3) % 26);
            }
            else if (ch >= 'A' && ch <= 'Z') {
                buf[i] = (char) ('A' + (ch - 'A' + 3) % 26);
            }
            else buf[i] = ch;
        }
        System.out.println("Шифр Цезаря (зашифровано): " + new String(buf));

        String text = "Java прекрасный язык программирования";
        String maxW = "", curW = "";

        for (int i = 0; i <= text.length(); i++) {
            if (i < text.length() && Character.isLetter(text.charAt(i))) {
                curW += text.charAt(i);
            } else {
                if (curW.length() > maxW.length()) maxW = curW;
                curW = "";
            }
        }
        System.out.println("Самое длинное слово: " + maxW);
    }
}

package lesson2.homework2;
//1. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
// (возвращает boolean значение).

public class task1 {
    private static boolean isPolindrom(String targetStr) {
        if (targetStr.length() == 1)
            return true;
        for (int i = 0; i < targetStr.length() / 2; i++) {
            if (targetStr.toLowerCase().charAt(i) != targetStr.toLowerCase().charAt(targetStr.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arrStr = {"qwq", "qwqe", "qwqw", "o", "Trort", "qwqsqwq", "qwqsqwqa", "9123k3219"};
        for (String s : arrStr)
            if (isPolindrom(s))
                System.out.printf("%s - полиндром \n", s);

    }
}

//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
package lesson1.homework1;

import java.util.Arrays;
import java.util.Collections;
public class task1 {
        public static void main(String[] args) {
            Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5, 11};
            int min = (int) Collections.min(Arrays.asList(numbers));
            int max = (int) Collections.max(Arrays.asList(numbers));

            System.out.println("Минимальное число: " + min);
            System.out.println("Максимальное число: " + max);
        }
    }
package lesson1;

import java.util.Scanner;

public class MainClassFromLessonOne {
    public static void main(String[] args) {
           exOne();
    }

    private static void exOne() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("Hello, %s",name);
        scanner.close();
    }
}

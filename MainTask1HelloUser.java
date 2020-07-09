package by.epam.learn.main.task;
                                // 1. Приветствовать любого пользователя при вводе его имени через командную строку.

import java.util.Scanner;

public class MainTask1HelloUser {
    public static void main(String[ ] args) {
        System.out.println("Введите Ваше имя и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Привет, " + name);
        scan.close();
    }
}

package by.epam.learn.main.task;
                        // 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

import java.util.Random;
import java.util.Scanner;

public class MainTask3RandomNums {
    public static void main(String[] args) {
        Random r = new Random();
        for (int x = 0; x < 5; x++) {
            int result = r.nextInt();
            System.out.println(result);
        }
        for (int x = 0; x < 5; x++) {
            int result = r.nextInt();
            System.out.print(result + " ");
        }
    }
}

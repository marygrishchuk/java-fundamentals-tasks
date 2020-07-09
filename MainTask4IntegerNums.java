package by.epam.learn.main.task;

//4.Ввести целые числа как аргументы командной строки, подсчитать их сумму/произведение и вывести результат на консоль.

import java.util.Scanner;

public class MainTask4IntegerNums {
    public static void main(String[ ] args) {
        Scanner con = new Scanner(System.in);
        int a = con.nextInt();
        int b = con.nextInt();
        int sum = a + b;
        int multi = a * b;
        System.out.println("Сумма чисел = " + sum);
        System.out.println("Произведение чисел = " + multi);
        con.close();
    }
}

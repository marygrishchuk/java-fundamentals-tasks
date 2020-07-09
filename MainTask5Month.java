package by.epam.learn.main.task;

                //5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего введенному числу.
                // Осуществить проверку корректности ввода чисел.

import java.util.Scanner;

public class MainTask5Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] month = {"январь", "февраль", "март", "апрель", "май", "июнь",
                "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        String s;
        if (a >=1 && a <=12) {
            s = month[a - 1];
            System.out.println(s);
        } else {
            System.out.println("Некорректный номер месяца");
        }
        sc.close();
    }
}

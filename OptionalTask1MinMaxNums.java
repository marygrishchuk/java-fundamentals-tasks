package by.epam.learn.main.task;
                        //Задание. Ввести n чисел с консоли.
                        //1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

public class OptionalTask1MinMaxNums {
    public static void main(String[] args) {
        int min = 10, max = 0;
        String minString = null, maxString = null;
        for (String digit : args) {   // перебираем массив
            if (digit.length() < min) {
                min = digit.length();
                minString = digit;
            }
            if (digit.length() > max) {
                max = digit.length();
                maxString = digit;
            }
        }
        System.out.println("Самое короткое число: " + minString + ", количество его цифр: " + min
                + "\nСамое длинное число: " + maxString + ", количество его цифр: " + max);
    }
}

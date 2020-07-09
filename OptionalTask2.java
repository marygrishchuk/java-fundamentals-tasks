package by.epam.learn.main.task;
                        //Задание: Ввести с консоли n - размерность матрицы a [n] [n].
                        // Задать значения элементов матрицы в интервале значений от -M до M с помощью
                        // генератора случайных чисел (класс Random). Упорядочить строки (столбцы) матрицы
                        // в порядке возрастания значений элементов k-го столбца (строки).

import java.util.Random;
import java.util.Scanner;

public class OptionalTask2 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Введите число строк и столбцов матрицы (2 числа): ");
        int x = scan1.nextInt();
        int y = scan1.nextInt();
        int a [][] = new int[x][y];
        int i = 0;
        int j = 0;

        for (i = 0; i < x; i++)
            for (j = 0; j < y; j++) {
                a[i][j] = (int) ((Math.random() * 201) - 100); //заполнили массив данными; от -100 до 100
            }
//        Упорядочить в порядке возрастания:
        for (i = 0; i < x * y - 1; i++) {
            for (j = i; j < y * x; j++) {
                if (a[i / y][i % y] > a[j / y][j % y]) {
                    a[i / y][i % y] = a[j / y][j % y];
                }
            }
        }
        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++)   //повторяем цикл для считывания данных массивов
                System.out.print(a[i][j] + "\t");   //будет отображаться в виде таблицы
            System.out.println("\n");
        }
        }
    }

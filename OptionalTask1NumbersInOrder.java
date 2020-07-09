package by.epam.learn.main.task;
                                // Задание. Ввести n чисел с консоли.
                                // Вывести числа в порядке возрастания (убывания) значений их длины.

import java.util.Scanner;

public class OptionalTask1NumbersInOrder {
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);
        System.out.print("Сколько чисел вы хотите отсортировать?");
        int a=scan1.nextInt();

        int i,j,k=0;
        int num[]=new int[a];
        int great[]= new int[a];

        Scanner scan2=new Scanner(System.in);
        System.out.println("Введите числа: ");

        for(i=0;i<a;i++)
            num[i] = scan2.nextInt();
        for (i=0;i<a;i++) {
            for(j=0;j<a;j++) {
                if(num[i]>num[j])
                    k++;}
            great[i]=k++;
            k=0;}

        System.out.println("В порядке возрастания: ");
        for(i=0;i<a;i++)
            for(j=0;j<a;j++)
                if(great[j]==i) System.out.println(num[j]);
        System.out.println("В порядке убывания: ");
        for(i=0;i<=a;i++)
            for(j=0;j<a;j++)
                if(great[j]==a-i) System.out.println(num[j]);
    }
}
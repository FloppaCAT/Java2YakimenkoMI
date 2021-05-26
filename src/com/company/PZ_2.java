package com.company;

import java.util.Scanner;

public class PZ_2 {
    public static void main(String[] args) {
        /**
         * Метод позволяет пользователю ввести 2 дробных числа, выводя сумму этих чисел до 4-го знака после запятой
         * Метод позволяет пользователю выбрать дополнительную арифметическую операцию для работы с уже введенными значениями
         * Порядок чисел при операции после их ввода изменить нельзя
         * @autor Якименко М.И.
         * @version 1.0
         * @param d содержит в себе результат вычисления выбранного арифмитеческого действия
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        //пользователь вводит произвольное дробное число
        double a = scan.nextDouble();
        System.out.print("Введите второе число: ");
        //пользователь вводит второе произвольное дробное число
        double b = scan.nextDouble();
        double c = a + b;
        System.out.printf("Резуьтат сложения: %.4f", c);
        System.out.print("\nВыберите тип операции, введя символ: сложение - '+', вычитание - '-', умножение - '*', деление - '/': ");
        /*первый Scan вызывается потому что вводится пустой символ. Если его не использовать, программа завершится выведя на экран
        * сообщение о неверном символе*/
        String empty= scan.nextLine();
        String math = scan.nextLine();
        double d = 0;
        //Сравнивается символ введный пользователем, чтобы выполнить арифметическое действие
        if (math.equals("+")){
            d = a + b;
            System.out.printf("Ответ: %.4f", d);
        } else if (math.equals("-")){
            d = a - b;
            System.out.printf("Ответ: %.4f", d);
        } else if (math.equals("*")){
            d = a * b;
            System.out.printf("Ответ: %.4f", d);
        } else if (math.equals("/")){
            d = a / b;
            System.out.printf("Ответ: %.4f", d);
        } else System.out.println("Введен некорректный символ");
    }
}

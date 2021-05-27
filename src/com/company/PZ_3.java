package com.company;

import java.util.Scanner;

class PZ_3 {
    public static void main(String[] args) {
        System.out.println("Выберите задание для запуска: 1 - калькулятор, 2 - поиск max в массиве");
        Scanner scan = new Scanner(System.in);
        int firstCount = scan.nextInt();
        if (firstCount == 1){
            calculate();
        }else if (firstCount == 2){
            arrayOf();
        }
    }


    static void calculate () {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = scan.nextDouble();
        System.out.print("Введите второе число: ");
        double b = scan.nextDouble();
        System.out.print("\nВыберите тип операции, введя символ: сложение - '+', вычитание - '-', умножение - '*', деление - '/': ");
        String empty = scan.nextLine();
        //empty нужен, т.к. в массив сразу передается одно значение
        String math = scan.nextLine();
        double d = 0;
        if (math.equals("+")) {
            d = a + b;
            System.out.printf("Ответ: %.4f", d);
        } else if (math.equals("-")) {
            d = a - b;
            System.out.printf("Ответ: %.4f", d);
        } else if (math.equals("*")) {
            d = a * b;
            System.out.printf("Ответ: %.4f", d);
        } else if (math.equals("/")) {
            d = a / b;
            System.out.printf("Ответ: %.4f", d);
        } else System.out.println("Введен некорректный символ");
    }

    static void arrayOf (){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность массива (числом): ");
        int arrSize = scan.nextInt();
        String[] strArray = new String[arrSize];
        String empty = scan.nextLine();
        //empty нужен, т.к. в массив сразу передается одно значение
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = scan.nextLine();
        }
        String result = strArray[0];
        int count = 0;
        for (int i = 0; i < strArray.length; i++) {
            boolean alphabet = strArray[i].matches("^\\s[абв][a-zA-Z]+$");
            if (!alphabet){
                ++count;
                break;
            }else if (strArray[i].length() > result.length()) {
                result = strArray[i];
            }
        } if (count > 0){
            System.out.println("Введено не слово");
        } else System.out.println("Самое длинное слово в массиве: " + result);
    }

}

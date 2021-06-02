package PZ_5;

import PZ_5.MathLayer.MathLayer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        System.out.println("Введите арифметическое дейсвтие в формате: \"Число действие число\"");
        System.out.println("Обязательно используйте пробелы между введенными символами!!");

        Scanner scan1 = new Scanner(System.in);
        String str1 = scan1.nextLine();
        String[] strArray = str1.split(" ");

        List<String> list = new ArrayList<String>(Arrays.asList(strArray));
        MathLayer.mathLayer(list.get(0), list.get(1), list.get(2));

    }
}

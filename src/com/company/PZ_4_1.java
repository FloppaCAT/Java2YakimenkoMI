package com.company;

import java.util.Random;

public class PZ_4_1 {

    public static void main(String[] args) {
        final int max = 10;
        final int min = -10;
        final int diff = max-min;
        Random rand1 = new Random();
        int[] arrayOf = new int[20];
        for (int i = 0; i< arrayOf.length; i++){
            arrayOf[i] = rand1.nextInt(diff+1)+min;
        }
        int min1 = 0;
        int max1 = 0;
        int index1 = 0;
        int index2 = 0;
        int c = 0;
        for (int i = 0;i< arrayOf.length; i++){
                if (max1<arrayOf[i]){
                    max1 = arrayOf[i];
                } else if (min1>arrayOf[i]){
                    min1 = arrayOf[i];
                }
        } for (int i = 0; i<arrayOf.length; i++){
            System.out.print(arrayOf[i] + " ");
        }
        System.out.println("\nМаксимальный элмент массива: " + max1 + "\nМинимальный элемент массива: " + min1);

        for(int i = 0; i<arrayOf.length; i++){
            if(max1!=arrayOf[i]){
                ++index1;
            } else break;
        }

        for(int i = 0; i<arrayOf.length; i++){
            if(min1!=arrayOf[i]){
                ++index2;
            } else break;
        }
        c = arrayOf[index1];
        arrayOf[index1] = arrayOf[index2];
        arrayOf[index2] = c;

        for (int i = 0; i<arrayOf.length; i++) {
            System.out.print(arrayOf[i] + " ");
        }
    }
}
package com.company;

import gifts.Candy;
import gifts.LadaVesta;
import gifts.PS4;
import gifts.gift;

public class PZ_4_2 {
    public static void main(String[] args) {
        double weightCounter;
        double priceCounter;

        Candy candy = new Candy("Snickers",2.0,5000.00,"Chocolate-black");
        PS4 playStation4 = new PS4("chocolatePS4",5.0,28000.00,22);
        LadaVesta Vesta = new LadaVesta("chocolateLadaVesta",2000.00,990000.00,"Orange");
        gift [] bagOfGifts = {candy,playStation4,Vesta};

        for (gift somegifts: bagOfGifts) {
            System.out.println(somegifts.toString());
        }
        weightCounter = candy.getWeight() + Vesta.getWeight() + playStation4.getWeight();
        priceCounter = candy.getPrice() + Vesta.getPrice() + playStation4.getPrice();

        System.out.println("\nОбщий вес подарка: " + weightCounter + " кг" + "\nОбщая стоимость подарка: " + priceCounter + " руб");
    }
}

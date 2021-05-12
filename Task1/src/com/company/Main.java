package com.company;

public class Main {
    public static void main(String[] args) {
        HomeCat homeCat = new HomeCat("Josuke", 3);
        homeCat.setName("Herbert");
        homeCat.setBreed("Munchkin");
        homeCat.layOnSofa();
        homeCat.spoilOnShoes();

        WildCat wildCat = new WildCat();
        wildCat.setName("Guts");
        wildCat.setBreed("Maine Coon");
        wildCat.hatePeople();
        wildCat.saveWorld();
    }
}


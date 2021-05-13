package com.company;

public class Main {
    public static void main(String[] args) {
        HomeCat herbert = new HomeCat("Josuke", 3);
        herbert.setName("Herbert");
        herbert.setBreed("Munchkin");
        herbert.layOnSofa();
        herbert.spoilOnShoes();

        HomeCat shierke = new HomeCat("Steve", 4);
        shierke.setName("Shierke");
        shierke.setBreed("Norwegian Forest Cat");


        WildCat guts = new WildCat();
        guts.setName("Guts");
        guts.setBreed("Maine Coon");
        guts.hatePeople();
        guts.saveWorld();

        WildCat serpiko = new WildCat();
        serpiko.setName("Serpiko");
        serpiko.setBreed("Persian Cat");
    }
}


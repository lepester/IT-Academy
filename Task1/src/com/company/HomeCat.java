package com.company;

public class HomeCat extends Cat {

    public String getName() {
        return "Herbert";
    }

    public String getBreed() {
        return "Munchkin";
    }

    public void layOnSofa(){
        System.out.println("It was a sunny day. Our cute cat is laying on sofa peacefully. He's name is " + getName());
        System.out.println("Thick and fluffy fur makes him very adorable.");
        System.out.println(" ");
        System.out.println("--I'm going to work, so be a pretty kitty, " + getName() + ".");
        System.out.println("--Meooww, said Herbert.");
        System.out.println(" ");
        System.out.println("|| Master closed the door and left the home ||");
        System.out.println(" ");
        System.out.println("Time has passed. " + getName() + " thought to myself: \"--I'm bored\".");
        System.out.println("Suddenly he looked at the door's side. To be more precise he looks at the shoes which lies there.");
    }

    public void spoilOnShoes() {
        while (money > 2) {
            System.out.println("Herbert is a tricky " + getBreed() + " cat, who likes to be sometimes a bad boi.");
            System.out.println("Herbert stood up and start to go right to the shoes.");
            System.out.println(" ");
            System.out.println("P.S. Herbert has an ability to spoil on shoes, so " + master + " looses his money. Herbert calls it 「The CASH」.");
            System.out.println(" ");
            System.out.println("Herbert thought to myself: \"I need to do this! Leess GO, 「The CASH」!\"");
            System.out.println(" ");
            System.out.println("P.P.S. Main ability of 「The CASH」 is MONEY BACK. It's stealing the money from it's owner and return to the " + getName() + ".");
            System.out.println(" ");
            System.out.println("|| " + master + " has lost the money ||");
            System.out.println(master + " said: \"--Oh noooo! My money collection!!!\"");
            System.out.println("----------------------------------------------------------------");
            money--;
        }
    }
}


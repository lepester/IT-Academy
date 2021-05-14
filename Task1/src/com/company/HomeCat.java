package com.company;

public class HomeCat extends Cat {
    private Master master;

    public HomeCat(String masterType, int money) {
        this.master = new Master(masterType, money);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void layOnSofa(){
        System.out.println("It was a sunny day. Our cute cat is laying on sofa, peacefully. He's name is " + getName() +
                "\nThick and fluffy fur makes him very adorable.\n" +
                "\n--I'm going to work, so be a pretty kitty, " + getName() + "." +
                "\n--Meooww, said Herbert." +
                "\n\n|| Master closed the door and left the home ||\n" +
                "\nTime has passed. " + getName() + " thought to himself: \"--I'm bored\"." +
                "\nSuddenly, he looked at the door. To be more precise he looked at the shoes which lies there.");
    }

    public void spoilOnShoes() {
        System.out.println("\nHerbert is a tricky " + getBreed() + " cat, who likes to be sometimes a bad boi." +
                "\nHerbert stood up and started going right to the shoes." +
                "\n\nP.S. Herbert has an ability to spoil on shoes, so Master looses his money. Herbert calls it 「The CASH」.\n" +
                "\nHerbert thought to himself: \"I need to do this! Leess GO, 「The CASH」!\"" +
                "\n\nP.P.S. Main ability of 「The CASH」 is MONEY BACK. This ability steals the money from target and provides it to " + getName() + ".\n" +
                "\n|| Master has lost the money ||\n" +
                "\nMaster said: \"--Oh noooo! My money collection!!!\"" +
                "\n\n----------------------------------------------------------------\n");
            this.master.money -= 2;
    }
}


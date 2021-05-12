package com.company;

public class WildCat extends Cat {

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

    public void hatePeople() {
        System.out.println(getName() + " is a wild " + getBreed() + " cat, who lives in the same town as Herbert.\n" + getName() +
                " is a homeless cat cause his owner left him, when " + getName() + " was only 2 months old." +
                "\nActually " + getName() + " hates people. " + "Despite of that " + getName() + " is a kind cat. He helps a lot to Morioh's residents." +
                "\n\nP.S. Morioh is a town located in Japan. There are only 27 residents live, including the Master.\n" +
                "\nOn the same day as Herbert had stolen the money from his Master " + getName() + " was walking on the streets of Morioh and he heard a loud noise:" +
                "\n\"--Oh noooo! My money collection!!!\"\n" + getName() + " thought to myself: \"--What? There can be no doubt. This is a work of a stand.\"");
    }

    public void saveWorld() {
        System.out.println("\n" + getName()+ "' life was not easy from very birth..." +
                "\n--Another cat was born. Another life will be wasted, said his Owner." +
                "\n--You can't just leave him here! Why can't we take him away with us?" +
                "\n--I told you why, Nancy! Stop it!\n" + "...\n" +
                "\nMemories flew through " + getName() + "' head.\n" +
                "\n--I don't want him to feel bad. I must help him, thought " + getName() + "." +
                "\n--With my stand I can do it. Come on,「The WORLD」" +
                "\n\nP.P.S ability of his stand is to erase a short amount of time (5-10 seconds) in the whole world.\n" +
                "\nMaster: oh, here is my money." +
                "\n--Hey, Josuke, are you going to drink coffee with us?\n" + "--Sure!");
    }
}

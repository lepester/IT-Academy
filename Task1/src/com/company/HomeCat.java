package com.company;

public class HomeCat extends Cat {
    public String getName() {
        return "Bebra";
    }

    public String getBreed() {
        return "Sis`";
    }

    public void layOnSofa(){
        System.out.println("Fat motherfucker " + getName() + " " + getBreed() + " is laying on sofa");
    }

}

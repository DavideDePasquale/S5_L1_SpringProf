package com.epicode.S5_L1_SpringProf.Esercizio;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends Article{

    private String name;
    private List<Topping> toppingList;

    public Pizza(int calories, double price, String name) {
        super(calories, price);
        this.name = name;
        this.toppingList= new ArrayList<Topping>();
    }

    public Pizza(int calories, double price) {
        super(calories, price);
    }

    public void addTopping(Topping t){
        this.toppingList.add(t);
    }

    public String getName() {
        return name;
    }


    public List<Topping> getToppingList() {
        return toppingList;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", toppingList=" + toppingList +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}

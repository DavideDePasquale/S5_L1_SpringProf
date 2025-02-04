package com.epicode.S5_L1_SpringProf.Esercizio;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Pizza> pizzaList;
    private List<Drink> drinkList;
    private List<Topping> toppingList;
    //o una soluzione o l'altra. essendo comunque articoli.
    private List<Article> menuList;

    public Menu() {

        this.pizzaList = new ArrayList<Pizza>();
        this.drinkList = new ArrayList<Drink>();
        this.toppingList = new ArrayList<Topping>();
        this.menuList = new ArrayList<Article>();
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public List<Drink> getDrinkList() {
        return drinkList;
    }

    public List<Topping> getToppingList() {
        return toppingList;
    }

    public List<Article> getMenuList() {
        return menuList;
    }
    public void printMenu(){
        System.out.println("----------------- MENU ------------------");
        //this.menuList.forEach(ele -> System.out.println(ele));
        System.out.println("PIZZAS : ");
        this.menuList.forEach(ele -> {if (ele instanceof Pizza){
            System.out.print(((Pizza)ele).getName() + " - ");
            System.out.print(((Pizza)ele).getCalories() + " - ");
            System.out.println(((Pizza)ele).getPrice());}
        });
        System.out.println("TOPPINGS : ");
        this.menuList.forEach(ele -> {if (ele instanceof Topping){
            System.out.print(((Topping)ele).getName() + " - ");
            System.out.print(((Topping)ele).getCalories() + " - ");
            System.out.println(((Topping)ele).getPrice());
        }
        });
        System.out.println("DRINKS : ");
        this.menuList.forEach(ele -> {if (ele instanceof Drink){
            System.out.print(((Drink)ele).getName() + " - ");
            System.out.print(((Drink)ele).getCalories() + " - ");
            System.out.println(((Drink)ele).getPrice());}
        });

    }
}

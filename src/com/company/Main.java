package com.company;

public class Main {

    public static void main(String[] args) {
        Burger burger = new Burger("Hamburger", "biscuit", "pork", "Lettuce", 15.00);
        burger.addBurgerAddition1("Coca", 9.00);
        burger.addBurgerAddition2("Corn", 13.00);
        burger.addBurgerAddition3("Green Salad", 12.00);
        burger.addBurgerAddition4("Popcorn", 11.00);
        burger.addBurgerAddition5("Heneiki", 10.00);
        System.out.println("Total price ordered is " + burger.menu());

        GrandBurger grandBurger = new GrandBurger("Grand Burger", 9.00);
        grandBurger.addGrandBurgerAddition1("Cheese", 8.00);
        grandBurger.addGrandBurgerAddition2("fries", 7.00);
        grandBurger.addBurgerAddition1("Coca", 14.00);
        System.out.println("Total amount is " + grandBurger.menu());
        CrispyBurger crispyBurger = new CrispyBurger();
        System.out.println("Total Crispy Burger price is " + crispyBurger.menu());


    }
 }

package com.company;

public class CrispyBurger extends Burger{
    public CrispyBurger() {
        super("Crispy Burger", "Fries", "Chicken", "Lettuce", 20.00);
        super.addBurgerAddition1("Fanta" ,15.00);
        super.addBurgerAddition2("beer", 10.00);
    }

    @Override
    public void addBurgerAddition1(String name, double price) {
        System.out.println("Items can not be added");
    }

    @Override
    public void addBurgerAddition2(String name, double price) {
        System.out.println("Items can not be added");
    }

    @Override
    public void addBurgerAddition3(String name, double price) {
        System.out.println("Items can not be added");
    }

    @Override
    public void addBurgerAddition4(String name, double price) {
        System.out.println("Items can not be added");
    }

    @Override
    public void addBurgerAddition5(String name, double price) {
        System.out.println("Items can not be added");
    }
}

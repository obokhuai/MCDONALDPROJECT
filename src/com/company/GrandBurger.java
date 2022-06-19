package com.company;

public class GrandBurger extends Burger {

    String additionExtra1Name;
    double additionExtra1Price;

    String additionExtra2Name;
    double additionExtra2Price;

    public GrandBurger(String name, double price) {
        super(name, "flakes", "Chicken", "Okra", price);
    }

    public void addGrandBurgerAddition1(String name, double price) {
        this.additionExtra1Name = name;
        this.additionExtra1Price = price;
    }

    public void addGrandBurgerAddition2(String name, double price) {
        this.additionExtra2Name = name;
        this.additionExtra2Price = price;
    }

    @Override
    public double menu() {
        double totalPriceOfGrandBurger = super.menu();
        if (additionExtra1Name != null) {
            totalPriceOfGrandBurger +=additionExtra1Price;
            System.out.println("Added " + additionExtra1Name + " for " + additionExtra1Price);
        }

        if (additionExtra2Name != null) {
            totalPriceOfGrandBurger +=additionExtra2Price;
            System.out.println("Added " + additionExtra2Name + " for " + additionExtra2Price);
        }
        return totalPriceOfGrandBurger;
    }
}

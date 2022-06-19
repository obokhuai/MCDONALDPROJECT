package com.company;

public class Burger {
    private String name;
    private String dessert;
    private String meat;
    private String vegetable;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    private String addition5Name;
    private double addition5Price;

    public Burger(String name, String dessert, String meat, String vegetable, double price) {
        this.name = name;
        this.dessert = dessert;
        this.meat = meat;
        this.vegetable = vegetable;
        this.price = price;
    }

    public void addBurgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;

    }

    public void addBurgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addBurgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addBurgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;

    }

    public void addBurgerAddition5(String name, double price){
        this.addition5Name = name;
        this.addition5Price = price;
    }

    public double menu(){
        double totalPriceOfItems = price;
        if (addition1Name !=null){
            totalPriceOfItems +=addition1Price;
            System.out.println("Added " + addition1Name + " for " + addition1Price);
        }

        if (addition2Name !=null){
            totalPriceOfItems +=addition2Price;
            System.out.println("Added " + addition2Name + " for " + addition2Price);
        }

        if (addition3Name !=null){
            totalPriceOfItems +=addition3Price;
            System.out.println("Added " + addition3Name + " for " + addition3Price);
        }

        if (addition4Name !=null){
            totalPriceOfItems +=addition4Price;
            System.out.println("Added " + addition4Name + " for " + addition4Price);
        }

        if (addition5Name !=null){
            totalPriceOfItems +=addition5Price;
            System.out.println("Added " + addition5Name + " for " + addition5Price);
        }
        return totalPriceOfItems;
    }
}

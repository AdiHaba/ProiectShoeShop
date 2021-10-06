package com.company;

public class Shoes {
    public String model;
    public String brand;
    public String color;
    private double size;
    private double price;
    int n;
    Shoes[] stock;

    public Shoes() {
        this.brand = brand;
    }

    public Shoes(String brand, String model, String color, double size, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


    public void Stock() {
        stock = new Shoes[n];

        stock[1] = new Shoes("Adidas", "SuperStar", "White", 39, 300);
        stock[2] = new Shoes("Adidas", "SuperStar", "Black", 42, 290);
        stock[3] = new Shoes("Nike", "AirForce", "Grey", 37, 250);
        stock[4] = new Shoes("Nike", "Mercurial", "Green-Orange", 43, 350);
        stock[5] = new Shoes("Vans", "Sk8-High", "Black-White", 40, 301);


    }

    public void CheckStock() {
        int n = 6;
        for (int i = 1; i < n; ++i) {
            System.out.println("/n" + i + stock[i]);
            return;
        }
    }
}

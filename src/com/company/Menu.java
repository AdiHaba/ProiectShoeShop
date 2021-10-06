package com.company;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Menu {
    private Scanner sc;
    private Object Shoes;
    int option;
    public Menu() {
        System.out.println("Menu:");
    }

    public void PrincipalMenu() {
        System.out.println("Welcome");
        System.out.println("What do you want?");
        System.out.println("1.Products 2.Your account 3.Budget 4.Exit site");
        option = sc.nextInt();

        switch (option) {
            case 1:
                new Shoes();
                break;
            case 2:
                new Buyer();
                break;
            case 3:
                System.exit(0);
                return;
            default:
                System.out.println("Unavalible");
                break;
        }

    }

    public void BuyShoes() {
        System.out.println("Menu");
        System.out.println("1. Our shoes");
        System.out.println("2. Check budget");
        System.out.println("3. Buy shoes");
        System.out.println("4. Exit program");
        switch (option) {
            case 1:
                System.out.println("This are our shoes");
                CheckStock();

            case 2:
                System.out.println("Your budget is: " + Budget._sold);
                BuyShoes();
                return;
            case 3:
                Buy();
                BuyShoes();
            case 4:
                System.exit(0);
                break;
            default:
                break;
        }

    }

    private void CheckStock() {
    }

    private void Buy() {
        System.out.println("Chose your shoes by the number");
        int option = sc.nextInt();
    }


    }



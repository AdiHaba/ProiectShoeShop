package com.company;
import java.util.Objects;
import java.util.Scanner;
import java.lang.String;

public class Buyer {
    Budget budget = new Budget(0);

    String name;
    String secondname;
    String adress;
    int phonenumber;


public void Buyer(String name, String secondname, String adress, int phonenumber) {
    this.name = name;
    this.secondname = secondname;
    this.adress = adress;
    this.phonenumber = phonenumber;
}
}

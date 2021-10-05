package com.company;

public class Budget {
    private double _sold = 0.0;

    public Budget(double sold) {
        _sold = sold;
    }

    public void DepositMoney(double sum){
        _sold = _sold + sum;
    }
}

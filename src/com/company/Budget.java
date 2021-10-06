package com.company;

public class Budget {
    public static double _sold = 0.0;

    public Budget(double sold) {
        _sold = sold;
    }
    public static double getsold() {
        return _sold;
    }

    public void DepositMoney(double sum){
        _sold = _sold + sum;
    }
}

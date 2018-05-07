package com.example.avion.funciona.Entities;

public class Accounts {

    String name;
    String initial;
    String moneyIn;
    String moneyOff;


    public Accounts(String name, String initial, String moneyIn, String moneyOff) {
        this.name = name;
        this.initial = initial;
        this.moneyIn = moneyIn;
        this.moneyOff = moneyOff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getMoneyIn() {
        return moneyIn;
    }

    public void setMoneyIn(String moneyIn) {
        this.moneyIn = moneyIn;
    }

    public String getMoneyOff() {
        return moneyOff;
    }

    public void setMoneyOff(String moneyOff) {
        this.moneyOff = moneyOff;
    }
}
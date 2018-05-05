package com.example.avion.funciona.Entities;

public class Account {

    private String name;
    private double initial;
    private double moneyin;
    private double moneyoff;


    public Account(){}


    public Account(String name, double initial , double moneyin, double moneyoff) {
        this.name = name;
        this.initial = initial;
        this.moneyin= moneyin;
        this.moneyoff = moneyoff;
    }


    public String getName() {return name; }

    public void setName(String name) { this.name = name; }

    public double getInitial() { return initial; }

    public void setInitial(double initial) {this.initial = initial; }

    public double getMoneyin() {return moneyin; }

    public void setMoneyin(double moneyin) {this.moneyin = moneyin;}

    public double getMoneyoff() { return moneyoff;}

    public void setMoneyoff(double moneyoff) {this.moneyoff = moneyoff; }
}


package com.example.avion.funciona.Entities;

public class Account {

     String name;
     String initial;
     String moneyin;
     String moneyoff;


   public Account(String name, String initial , String moneyin, String moneyoff) {
        this.name = name;
        this.initial = initial;
        this.moneyin= moneyin;
        this.moneyoff = moneyoff;
    }


    public String getName() {return name; }

    public void setName(String name) { this.name = name; }

    public String getInitial() { return initial; }

    public void setInitial(String initial) {this.initial = initial; }

    public String getMoneyin() {return moneyin; }

    public void setMoneyin(String moneyin) {this.moneyin = moneyin;}

    public String getMoneyoff() { return moneyoff;}

    public void setMoneyoff(String moneyoff) {this.moneyoff = moneyoff; }
}


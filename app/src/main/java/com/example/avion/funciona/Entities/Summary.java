package com.example.avion.funciona.Entities;


public class Summary {
    String nameSum;
    String status;
    String incomesSum;
    String expensesSum;

    public Summary(String name, String status, String incomesSum, String expensesSum) {
        this.nameSum = name;
        this.status = status;
        this.incomesSum = incomesSum;
        this.expensesSum = expensesSum;
    }

    public String getNameSum() {
        return nameSum;
    }

    public void setNameSum(String nameSum) {
        this.nameSum = nameSum;
    }

    public String getEstadoStatus() {
        return status;
    }

    public void setEstadoStatus(String status) {
        this.status = status;
    }

    public String getIncomesSum() {
        return incomesSum;
    }

    public void setIncomesSum(String incomesSum) {
        this.incomesSum = incomesSum;
    }

    public String getExpensesSum() {
        return expensesSum;
    }

    public void setExpensesSum(String expensesSum) {
        this.expensesSum = expensesSum;
    }
}

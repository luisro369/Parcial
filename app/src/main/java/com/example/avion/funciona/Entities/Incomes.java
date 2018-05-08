package com.example.avion.funciona.Entities;

public class Incomes {
    String name;
    String total;
    String provider;
    String product;
    String subtotal;


    public Incomes(String name, String total, String provider, String product, String subtotal){
        this.name = name;
        this.total = total;
        this.provider = provider;
        this.product = product;


        this.subtotal = subtotal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getTotal() { return total; }

    public void setTotal(String total) { this.total = total; }


    public String getProvider() { return provider; }

    public void setProvider(String provider) { this.provider = provider; }


    public String getProduct() { return product; }

    public void setProduct(String product) { this.product = product; }


    public String getSubtotal() { return subtotal; }
    public void setSubtotal(String subtotal){this.subtotal = subtotal;}
}

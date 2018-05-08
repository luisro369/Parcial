package com.example.avion.funciona.Entities;

public class Incomes {
    String name;
    String total;
    String provider;
    String product;
    String quantity;
    String price;
    String subtotal;


    public Incomes(String name, String total, String provider, String product, String quantity, String price, String subtotal){
        this.name = name;
        this.total = total;
        this.provider = provider;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
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


    public String getQuantity() { return quantity; }

    public void setQuantity(String quantity) { this.quantity = quantity; }


    public String getPrice() {  return price; }

    public void setPrice(String price) { this.price = price; }


    public String getSubtotal() { return subtotal; }
    public void setSubtotal(String subtotal){this.subtotal = subtotal;}
}

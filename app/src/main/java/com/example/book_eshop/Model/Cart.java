package com.example.book_eshop.Model;

public class Cart
{
    private String pid, name, price, quantity, discount, stock;

    public Cart() {
    }

    public Cart(String pid, String name, String price, String quantity, String discount, String stock) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
        this.stock = stock;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getname() {
        return name;
    }

    public void setPname(String pname) {
        this.name = pname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}

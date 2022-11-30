package com.doc.beans;

import java.util.Objects;

public class Product {

    //id,name,qty,price
    private int pid;
    private String name;
    private int qty;
    private double price;

    public Product(int pid, String name, int qty, double price) {
        this.pid = pid;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        Product product = (Product) o;
        return this.pid==product.pid;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}

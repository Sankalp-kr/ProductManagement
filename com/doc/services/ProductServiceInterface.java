package com.doc.services;

import com.doc.beans.Product;

import java.util.ArrayList;

public interface ProductServiceInterface {
    public void addProduct();
    public Product findById(int search);

    public Product findProductByName(String pname);

    public Product removeById(int search_id);
    public Product removeByName(String search_string);
    public void changePrice(Product if_found, Double new_price);
    //public ArrayList<Product> SortByPrice();
}

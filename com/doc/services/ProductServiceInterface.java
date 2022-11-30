package com.doc.services;

import com.doc.beans.Product;
public interface ProductServiceInterface {
    public void addProduct();
    public Product findById(int search);

    public Product findProductByName(String pname);

    public Product removeById(int search_id);
}

package com.doc.services;

import com.doc.beans.Product;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.sort;

public class ProductService implements ProductServiceInterface{

    Scanner ins = new Scanner(System.in);
    //plist
    public static List<Product> plist;

    static{
        plist = new ArrayList<>(5);
        plist.add(new Product(1,"Parle G",1000,10.0));
        plist.add(new Product(2,"Parle A",10,9.0));
        plist.add(new Product(3,"Parle B",103,11.0));
        plist.add(new Product(4,"Parle C",1002,13.0));
        plist.add(new Product(5,"Parle D",1010,14.0));
        plist.add(new Product(6,"Parle E",1022,12.0));

    }
    @Override
    public void addProduct(){
        System.out.println("Enter the id of the product: ");
        int pid = ins.nextInt();
        System.out.println("Enter the name of the product: ");
        ins.nextLine();
        String name = ins.nextLine();
        System.out.println("Enter the quantity of the product: ");
        int pqty= ins.nextInt();
        System.out.println("Enter the price of the product: ");
        double pprice = ins.nextDouble();
        plist.add(new Product(pid,name,pqty,pprice));

        System.out.println();

        System.out.println("Product added Successfully");
    }

    @Override
    public Product findById(int search) {
        Product to_search = new Product(search);
        int found = plist.indexOf(to_search);
        if(found!=-1) {
            Product fo = plist.get(found);
            return fo;
        }else{
            return null;
        }
    }

    @Override
    public Product findProductByName(String pname) {
        for(Product test:plist){
            if(test.getName().equals(pname))
                return test;
        }
        return null;
    }

    @Override
    public Product removeById(int search_id) {
        Product s_id_product = new Product(search_id);
        int remove_this = plist.indexOf(s_id_product);
        if(remove_this==-1)
            return null;
        else{
            System.out.println("Are you sure you want to remove this:: 'y/n': ");
            String choose = ins.next();
            if(choose.charAt(0)=='y')
                return plist.get(remove_this);
            else return null;
        }
    }


    @Override
    public Product removeByName(String search_string) {
        for(Product test: plist){
            if(test.getName().equals(search_string)) {
                System.out.println("Object found, Are you sure you want to delete the object:: y/n ");
                String confirm = ins.nextLine();
                if(confirm.charAt(0)=='y')
                    return test;
                else{
                    return null;
                }
            }
        }
        return null;
    }


    @Override
    public void changePrice(Product prdt,Double new_price) {
        prdt.setPrice(new_price);
    }

//    @Override
//    public ArrayList<Product> SortByPrice() {
//        List<Product> retthis = new ArrayList<>();
//        .sort(plist);
//    }
}

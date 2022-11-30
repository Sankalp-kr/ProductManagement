package com.doc.services;

import com.doc.beans.Product;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class ProductService implements ProductServiceInterface{

    Scanner ins = new Scanner(System.in);
    //plist
    public static List<Product> plist;

    static{
        plist = new ArrayList<>(5);
        plist.add(new Product(1,"Parle G",1000,10.0));
        plist.add(new Product(1,"Parle A",10,9.0));
        plist.add(new Product(1,"Parle B",103,11.0));
        plist.add(new Product(1,"Parle C",1002,13.0));
        plist.add(new Product(1,"Parle D",1010,14.0));
        plist.add(new Product(1,"Parle E",1022,12.0));

    }
    @Override
    public void addProduct(){
        System.out.println("Enter the id of the product: ");
        int pid = ins.nextInt();
        System.out.println("Enter the name of the product: ");
        String name = ins.nextLine();
        System.out.println("Enter the quantity of the product: ");
        int pqty= ins.nextInt();
        System.out.println("Enter the price of the product: ");
        double pprice = ins.nextDouble();
        plist.add(new Product(pid,name,pqty,pprice));

        System.out.println();

        System.out.println("Product added Successfully");
    }


}

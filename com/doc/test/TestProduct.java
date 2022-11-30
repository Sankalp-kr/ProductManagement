package com.doc.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import com.doc.beans.Product;
import com.doc.services.ProductService;
import com.doc.services.ProductServiceInterface;


public class TestProduct {
    public static void main(String[] args){

        Scanner ins = new Scanner(System.in);
        int choice=99;
        ProductServiceInterface ts = new ProductService();

         /*
         //printing all values of the array
         for(Product test: ProductService.plist) {
            System.out.println(test);
        }
        */

        do{
            System.out.println("Enter the choice: ");
            System.out.println("1.create new product\n 2.remove by id \n3. remove by name \n4.Disaplay all \n5.find by id \n6. sort by price ");
            System.out.println("7. find product by quantity>certain quantity \n8.modify price \n9.find by name \n10.exit");
            choice = ins.nextInt();


            switch (choice){
                case 1:
                    // parameters of the Product is not entered here as the parameters may
                    // change in the future and we want main to be as much untouched later as possible
                    ts.addProduct();

                    System.out.println("Here is the updated list..");


                    break;

                case 2:
                    System.out.println("Enter the id of the product: ");
                    int search_id = ins.nextInt();
                    Product remove_this = ts.removeById(search_id);
                    ((ProductService)ts).plist.remove(remove_this);

                    break;

                case 3:
                    System.out.println("Enter the name of the product: ");
                    ins.nextLine();
                    String search_string = ins.nextLine();
                    Product remove_this_name = ts.removeByName(search_string);
                    if(remove_this_name==null)
                        System.out.println("Not deleted");
                    else {
                        ((ProductService) ts).plist.remove(remove_this_name);
                        System.out.println("Deleted");
                    }

                    break;


                case 4:
                    System.out.println("Displaying all values of the array: ");

                    for(Product test: ((ProductService)ts).plist) {
                        System.out.println(test);
                    }

                    break;


                case 5:
                    System.out.println("Enter the id that you want the info for: ");
                    int search = ins.nextInt();
                    Product found = ts.findById(search);

                    if(found==null)
                        System.out.println("Not found.");
                    else
                        System.out.println(found);


                    break;

                case 6:
                    System.out.println("Sorting by price...");
                    Collections.sort(((ProductService)ts).plist);

                    break;


                case 8:
                    System.out.println("Enter the id of the product you want to change the name of: ");
                    int change_price_id = ins.nextInt();
                    Product if_found1 = ts.findById(change_price_id);
                    if(if_found1==null)
                        System.out.println("Cannot change the price");
                    else{
                        System.out.println("Enter the new price: ");
                        double new_price = ins.nextDouble();
                        ts.changePrice(if_found1,new_price);
                        System.out.println("New price changed successfully");
                    }

                    break;
                case 9:
                    System.out.println("Enter the name of product: ");
                    ins.nextLine();
                    String pname = ins.nextLine();
                    Product ProductName = ts.findProductByName(pname);
                    System.out.println(ProductName);

                    break;

                case 10:
                    System.out.println("Thank you for using the application: ");
            }

        }while(choice!=10);
    }
}

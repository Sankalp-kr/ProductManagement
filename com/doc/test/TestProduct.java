package com.doc.test;

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
            System.out.println("7. sort by quantity \n8.modify price \n9.find by name \n10.exit");
            choice = ins.nextInt();


            switch (choice){
                case 1:
                    // parameters of the Product is not entered here as the parameters may
                    // change in the future and we want main to be as much untouched later as possible
                    ts.addProduct();

                    System.out.println("Here is the updated list..");


                    break;
                case 4:
                    System.out.println("Displaying all values of the array: ");

                    for(Product test: ProductService.plist) {
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
            }

        }while(choice!=10);
    }
}

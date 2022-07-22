package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class ProductMain1 {
	public static void main(String[] args) {
		List<Product> productList=new ArrayList<>();
		productList.add(new Product(1,"Laptop",55000));
        productList.add(new Product(2,"Mobile",12000));
	    productList.add(new Product(3,"TV",30000));
	    productList.add(new Product(4,"App",12000));
	    productList.add(new Product(5,"Laptop",15000));
	    System.out.println("Before Sorting");
 	    productList.forEach(product->System.out.println(product));
		/*
		 * System.out.
		 * println("<-----------------With Anonymous class--------------------->");
		 * Collections.sort(productList,new Comparator<Product>(){
		 * 
		 * @Override public int compare(Product arg0, Product arg1) { // TODO
		 * Auto-generated method stub return arg0.getPrice()>arg1.getPrice()?1:-1; }
		 * 
		 * });
		 */
 	   System.out.println("After Sorting");
 	  //productList.forEach(product->System.out.println(product));
 	  System.out.println("<----------------------------With lambda expression----------->");
 	  Collections.sort(productList,(product1,product2)->product1.getPrice()>product2.getPrice()?1:-1);
 	 //productList.forEach(product->System.out.println(product));
   //	productList.forEach(System.out::println);
	System.out.println("Sorting on name");
	Collections.sort(productList,Comparator.comparing(Product::getProductName).reversed().thenComparing(Product::getPrice));
	productList.forEach(System.out::println);
	
	
	
	}

}

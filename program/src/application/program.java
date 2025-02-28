package application;

import java.util.Locale;

import java.util.Scanner;

import entities.Products;


public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter product data ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		Products products = new Products(name, price);
		
		products.setName("Computer");
		System.out.println("Updated name: " + products.getName());
		products.setPrice(1500);
		System.out.println("Updated price: " + products.getPrice());
		System.out.println();
		System.out.println("Product data: " + products);
		
		System.out.println();
		System.out.println("Enter  the number of products tobe added in stock: ");
	    int quantity = sc.nextInt();
		products.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + products);
		
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock");
		quantity = sc.nextInt();
		products.removeProducts(quantity);
		
		
		System.out.println();
		System.out.println("Update data: " + products);
		
		
		sc.close();
	}

}

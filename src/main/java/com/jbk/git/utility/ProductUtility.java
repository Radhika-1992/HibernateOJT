package com.jbk.git.utility;

import java.util.Scanner;

import com.jbk.git.entity.Product;

public class ProductUtility {
	static Scanner scanner = new Scanner(System.in);

	public static Product getProduct() {

		System.out.println("Enter Product id");
		int productId = scanner.nextInt();

		System.out.println("Enter Product name");
		String productName = scanner.next();

		System.out.println("Enter Product price");
		double productPrice = scanner.nextDouble();

		System.out.println("Enter Product quantity");
		int productQty = scanner.nextInt();

		System.out.println("Enter Product category");
		String productCategory = scanner.next();

		Product product = new Product(productId, productName, productPrice, productQty, productCategory);

		return product;

	}
}

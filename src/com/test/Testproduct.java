package com.test;
import com.model.Product;

public class Testproduct {

	public static void main(String[] args) {
		Product p1= new Product();
		p1.setId(100);
		p1.setName("pen");
		p1.setPrice(250);
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getPrice());
		
		

	}

}

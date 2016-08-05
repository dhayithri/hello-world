package com.test;

import com.model.Category;

public class TestCategory {
	
	public static void main(String arg[])
	{
		
		Category category=new Category();
		category.setId(100);
		category.setCategoryname("Mobile");
		System.out.println(category.getId());
		System.out.println(category.getCategoryname());
		
	}

}

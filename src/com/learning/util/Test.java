package com.learning.util;

import java.util.ArrayList;
import java.util.List;

import com.learning.dao.ProductDao;
import com.learning.pojo.Product;

public class Test {

	public static void main(String args[]){
		delProductById();
		getProductByAll();
	}
	
	public static void addProduct(){
		ProductDao productDao = new ProductDao();
		Product product = new Product();
		product.setProductName("HelloKitty");
		product.setProductId("003212");
		product.setProductType("toy");
		product.setPrice(10);
		product.setImgUrl("http://www.mymarket.com/toys/003212/hellokitty.jpg");
		productDao.addProduct(product);
	}
	
	public static void addProduct1(){
		ProductDao productDao = new ProductDao();
		Product product = new Product();
		product.setProductName("HelloBaby");
		product.setProductId("003210");
		product.setProductType("toy");
		product.setPrice(10);
		product.setImgUrl("http://www.mymarket.com/toys/003210/hellobaby.jpg");
		productDao.addProduct(product);
	}
	
	public static void getProductById(){
		ProductDao productDao = new ProductDao();
		Product product = productDao.getProductById(1);
		System.out.println(product.toString());
	}
	
	public static void updateProduct(){
		ProductDao productDao = new ProductDao();
		Product product = new Product();
		product.setId(2);
		product.setProductName("Bear");
		product.setProductId("003584");
		product.setProductType("Toy");
		product.setPrice(25);
		product.setImgUrl("http://www.mymarket.com/toys/003584/bear.jpg");
		productDao.updateProduct(product);
	}
	
	public static void delProductById(){
		ProductDao productDao = new ProductDao();
		productDao.delProductById(2);
	}
	
	public static void getProductByAll(){
		ProductDao productDao = new ProductDao();
		List <Product> allproducts = new ArrayList<Product>(); 
		allproducts = productDao.getAllProducts();
		for (int i=0; i<allproducts.size(); i++)
		{System.out.println(allproducts.get(i));}
	}
	
}

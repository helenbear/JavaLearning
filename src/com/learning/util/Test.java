package com.learning.util;

import com.learning.dao.ProductDao;
import com.learning.pojo.Product;

public class Test {

	public static void main(String args[]){
		getProductById();
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
	
	public static void getProductById(){
		ProductDao productDao = new ProductDao();
		Product product = productDao.getProductById(1);
		System.out.println(product.toString());
	}
}

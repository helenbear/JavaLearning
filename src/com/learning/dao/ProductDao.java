package com.learning.dao;

import java.util.List;

import com.learning.pojo.Product;

public class ProductDao {

	public boolean addProduct(Product product){
		String sql = "insert into product(productId,productName,price)";
		return false;
	}
	
	public boolean updateProduct(Product product){
		return false;
		
	}
	
	public boolean delProductById(int id){
		return false;
	}
	
	public Product getProductById(int id){
		return null;
	}
	
	public List<Product> getAllProducts(){
		return null;
	}
}

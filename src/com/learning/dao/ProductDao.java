package com.learning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.learning.pojo.Product;
import com.learning.util.DBConnection;

public class ProductDao {
	DBConnection dbConnect = new DBConnection();
	
	public boolean addProduct(Product product){
		String sql = "insert into product(productId,productName,price,productType,imgUrl) values(?,?,?,?,?)";
		Connection conn = dbConnect.getConnection();
		PreparedStatement psmt = null;
		try {
			 psmt = conn.prepareStatement(sql);
			 psmt.setString(1, product.getProductId());
			 psmt.setString(2, product.getProductName());
			 psmt.setFloat(3, product.getPrice());
			 psmt.setString(4,product.getProductType());
			 psmt.setString(5, product.getImgUrl());
			psmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally{
			if(psmt != null){
				try {
					psmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return true;
	}
	
	public boolean updateProduct(Product product){
		String sql = "update product set productId=?,productName=?,price=?,productType=?,imgUrl=? where id=? ";
		return false;
		
	}
	
	public boolean delProductById(int id){
		return false;
	}
	
	public Product getProductById(int id){
		String sql = "select * from product where id=?";
		Connection conn = dbConnect.getConnection();
		PreparedStatement psmt = null;
		ResultSet rs = null;
		Product product = null;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);
			rs = psmt.executeQuery();
			while(rs.next()){
				rs.getString("id");
				String productId = rs.getString("productId");
				String productName = rs.getString("productName");
				float price = rs.getFloat("price");
				String productType = rs.getString("productType");
				String imgUrl = rs.getString("imgUrl");
				
				product = new Product(id,productId,productName,price,productType,imgUrl);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
	}
	
	public List<Product> getAllProducts(){
		return null;
	}
}

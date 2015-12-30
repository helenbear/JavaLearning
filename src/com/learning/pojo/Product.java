package com.learning.pojo;

public class Product {

	private int id;
	private String productId;
	private String productName;
	private float price;
	private String productType;
	private String imgUrl;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public Product(int id, String productId, String productName, float price, String productType, String imgUrl) {
		super();
		this.id = id;
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.productType = productType;
		this.imgUrl = imgUrl;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product:{\"id\":" + id + ", \"productId\":" + productId + ", \"productName\":" + productName + ", \"price\":" + price
				+ ", \"productType\":" + productType + ", \"imgUrl\":" + imgUrl + "}";
	}
	
	
	
}

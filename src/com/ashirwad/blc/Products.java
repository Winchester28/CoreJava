package com.ashirwad.blc;

public class Products {
	int productId;  // non-static /instace
	String productName;
	double productPrice;
	public void setProductData(int id,String name,double price)
	{
		productId=id;
		productName=name;
		productPrice=price;
		
	}
	public void getProductDetails()
	{
		IO.println(" Products id =" + productId);
		IO.println("Product Name ="+ productName);
		IO.println("Product Price="+productPrice);
	}

}

package com.app2.service;

import java.util.List;

import com.app2.exceptions.ProductException;
import com.app2.model.Product;

public interface ProductService {
  
	public List<Product> getListOfProducts();
	public List<Product> Get_All_products_between_500_1500() throws ProductException;

	public List<Product> Get_All_products_with_Given_Brand(String brand) throws ProductException;
	public Product Get_ProductBy_Id(Integer id) throws ProductException;
	public String createProduct(Product product);
	public String deleteProduct(Integer id);
	public Product updateProduct(Product product);
	public List<Product> getAllProductLessThanPrice(int price)  throws ProductException;

	
	
}

package com.app2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app2.dao.ProductDao;
import com.app2.exceptions.ProductException;
import com.app2.model.Product;


import ch.qos.logback.core.joran.conditional.ElseAction;

@Service
public class ProductServiceImpl implements ProductService{

	
	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<Product> getListOfProducts() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

	@Override
	public List<Product> Get_All_products_between_500_1500() throws ProductException {
		List<Product> products= productDao.Get_All_products_between_500_1500();
		if(products.isEmpty()) throw new ProductException("no product exist within range of 500 and 1000");
		else return products;
	}

	@Override
	public List<Product> Get_All_products_with_Given_Brand(String brand) throws ProductException {
		List<Product> products= 	productDao.Get_All_products_with_Given_Brand(brand);
		if(products.isEmpty()) throw new ProductException("no product exist with given brand "+brand);
		else return products;
	}

	@Override
	public Product Get_ProductBy_Id(Integer id) throws ProductException {
		// TODO Auto-generated method stub
		return productDao.findById(id).orElseThrow(() -> new ProductException("Wrong Product Id"));
	}

	@Override
	public String createProduct(Product product){
		// TODO Auto-generated method stub
		
		Product product2 =productDao.save(product);
		
		System.out.println(product2);
		if(product2!=null) return "saved successfully";
		else return "something went wrong";
	}

	@Override
	public String deleteProduct(Integer id) throws ProductException {
		// TODO Auto-generated method stub
	Optional<Product> opt	=productDao.findById(id);
	Product product=	opt.get();
	if(product!=null) {productDao.deleteById(id);
		return "SUCESSfully deleted"; }
	else throw new ProductException("wrong product id");
	}

	
	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
     Product product1=	productDao.findById(product.getId()).orElseThrow(() -> new ProductException("Invalid product supplied"));
//         if(product1!=null) 
		return productDao.save(product);
         //else throw new ProductException("wrong product id");
	}

	@Override
	public List<Product> getAllProductLessThanPrice(int price) throws ProductException {
		// TODO Auto-generated method stub
		 List<Product> lists=	productDao.findByPriceLessThanEqual(price);
		 if(lists.isEmpty()) throw new ProductException("no product exists with this price");
		return lists;
	}

	
}

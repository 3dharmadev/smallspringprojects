package com.app2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

 import com.app2.model.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

	
	@Query("from Product where price BETWEEN 500 AND 1000")
	public List<Product> Get_All_products_between_500_1500();
	
	public List<Product> findByPriceLessThanEqual(int price);
	
	@Query("from Product where brand=:br")
	public List<Product> Get_All_products_with_Given_Brand(@Param("br") String brand);

}

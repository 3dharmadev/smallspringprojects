package com.app2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app2.model.Product;
import com.app2.service.ProductService;
 
@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/product")
	public ResponseEntity<String> saveProductDetailsHandler(@RequestBody Product product){
		
		
		String savedProduct= productService.createProduct(product);
		
		return new ResponseEntity<>(savedProduct,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProducts(){
		
	List<Product> products=	productService.getListOfProducts();
	
	return new ResponseEntity<>(products,HttpStatus.OK);
		
	}
	
	@GetMapping("/productsbetween500_&_1000")
	public ResponseEntity<List<Product>> getAllProductsbetween500_To_1000(){
		
		List<Product> products=	productService.Get_All_products_between_500_1500();
		
		return new ResponseEntity<>(products,HttpStatus.OK);
			
		}
	
	@GetMapping("/products/{brand}")
    public ResponseEntity<List<Product>> Get_All_products_with_Given_Brand(@PathVariable("brand") String brand){
		
		List<Product> products=	productService.Get_All_products_with_Given_Brand(brand);
		
		return new ResponseEntity<>(products,HttpStatus.OK);
			
		}
	
	@GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Integer id){
		
		Product product=	productService.Get_ProductBy_Id(id);
		
		return new ResponseEntity<>(product,HttpStatus.OK);
			
		}
	
	
	@DeleteMapping("/product/{id}")
    public ResponseEntity<String> deleteById(@PathVariable("id") Integer id){
		
		String str=	productService.deleteProduct(id);
		
		return new ResponseEntity<>(str,HttpStatus.OK);
			
		}
	
	
	@PutMapping("/product/{id}")
    public ResponseEntity<Product> updateById(@PathVariable("id") Integer id,@RequestBody Product product){
		
		 product.setId(id);
		 System.out.println(product);
		Product product1=	productService.updateProduct(product);
		
		return new ResponseEntity<>(product1,HttpStatus.OK);
			
		}
	
	
	
	@GetMapping("/getallproductlessthanequaltoprice/{price}")
 public ResponseEntity<List<Product>> getallproductlessthanequaltoprice(@PathVariable("price") Integer price){
		
		List<Product> products=	productService.getAllProductLessThanPrice(price);
		
		return new ResponseEntity<>(products,HttpStatus.OK);
			
		}
	
	
	
	
	
	
	

}

package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.productServiceImpl;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


@RequestMapping("/product")
@RestController
public class productController {

	@Autowired
	productServiceImpl ps;
	
	
	@GetMapping("/welcome")
	public String Weclome() {
		
	
	return "Welcome to Product Catalog!!All the best";

	}
	
	@PostMapping("/register")
	@ApiOperation(value = "To Register the Product",
	notes="To regitser the new product to the catalog",
	response=Product.class)
	public Product registerProduct(@RequestBody Product product) {
		Product p=ps.registerProduct(product);
		
	return p;

	}
	
	@GetMapping("/getall")
	public List<Product> getAllProductDetails() {
		
	
	return ps.getAllProductDetails();

	}
	
	@GetMapping("/getbyId/{id}")
	public Optional<Product> getProductById(@PathVariable Long id) {
		
	
	return ps.getProductById(id);

	}
	
	@GetMapping("/getByCategory/{category}")
	public List<Product>getProductByCategory(@ApiParam(value="Category value needed to retrieve the data",required=true)@PathVariable String category)
	{
	
	return ps.getProductByCategory(category);

	}
	
	@PutMapping("/update/{id}")
	public int updateProductsById(@PathVariable Long id,@RequestBody Product prod) {
		
	
	return ps.updateProducts(id, prod);

	}

}

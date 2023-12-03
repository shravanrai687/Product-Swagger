package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.productRepo;







@Service
public class productServiceImpl implements productService {

	@Autowired
	productRepo repo;
	
	public Product registerProduct(Product prod) {
		// TODO Auto-generated method stub
		Optional<Product> prodd = repo.findById(prod.getId());
		if(!prodd.isPresent())
		{
			return repo.save(prod);
			
		}else
			return null;
			
	}
	
	public List<Product> getAllProductDetails() {
		return repo.findAll();
	}
	public Optional<Product> getProductById(Long id) {
		return repo.findById(id);
	}
	public List<Product> getProductByCategory(String category) {
		return repo.listProductByCategory(category);
	}
	
	public int updateProducts(Long id,Product prod)
	{
		return repo.updateProducts(id, prod.getRetail_price(), prod.getDiscounted_price(), prod.isAvailabilty());
	}
}

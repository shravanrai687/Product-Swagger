package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;

@Repository
public interface productRepo extends JpaRepository<Product,Long> {

	
	@Query("SELECT p FROM Product p WHERE p.category = :c")
	public List<Product> listProductByCategory(@Param("c") String category);
	
	@Query("UPDATE Product SET retail_price =:rp,discounted_price =:dp,availabilty =:a  where id = :id")
	public int updateProducts(@Param("id")Long id,@Param("rp") double retail_price,@Param("dp") double discounted_price,@Param("a") boolean availabilty);
}

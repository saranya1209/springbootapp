package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.product;

public interface ProductRepository extends CrudRepository<product, Integer>{
	
	List<product> findByName(String name);
	
	List<product> findByPrice(Double price);
	
	List<product> findByNameAndPrice(String name, Double price);

}
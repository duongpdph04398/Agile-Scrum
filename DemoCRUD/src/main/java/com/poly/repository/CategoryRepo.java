package com.poly.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.poly.entities.Category;

public interface CategoryRepo extends CrudRepository<Category, Integer> {
	
	List<Category> findByNameContaining(String name);
	
}

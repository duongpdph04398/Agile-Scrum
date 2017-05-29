package com.poly.services;

import java.util.List;

import com.poly.entities.Category;

public interface CategoryService {

	Iterable<Category> findAll();

	List<Category> search(String key);

	Category findOne(int id);

	void save(Category cate);

	void delete(int id);

}

package com.poly.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poly.entities.Category;
import com.poly.repository.CategoryRepo;

@Service
public class CateServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepo cateRepo;
	
	@Override
	public Iterable<Category> findAll() {
		// TODO Auto-generated method stub
		return cateRepo.findAll();
	}

	@Override
	public List<Category> search(String key) {
		// TODO Auto-generated method stub
		return cateRepo.findByNameContaining(key);
	}

	@Override
	public Category findOne(int id) {
		// TODO Auto-generated method stub
		return cateRepo.findOne(id);
	}

	@Override
	public void save(Category cate) {
		// TODO Auto-generated method stub
		cateRepo.save(cate);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		cateRepo.delete(id);
	}

}

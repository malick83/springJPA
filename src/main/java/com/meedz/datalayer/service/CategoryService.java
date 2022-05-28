package com.meedz.datalayer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meedz.datalayer.model.Category;
import com.meedz.datalayer.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Iterable<Category> getCategories(){
		return categoryRepository.findAll();
	}
	
	public Optional<Category> getCategory(Integer id){
		return categoryRepository.findById(id);
	}
	public Category addCategory(Category category) {
		return categoryRepository.save(category);
	}
	
	public void deleteCategory(Integer id) {
		categoryRepository.deleteById(id);
	}

}

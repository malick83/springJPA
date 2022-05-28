package com.meedz.datalayer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meedz.datalayer.model.Product;
import com.meedz.datalayer.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Iterable<Product> getProducts(){
		return productRepository.findAll();
	}
	public Iterable<Product> getProductsByName(String name){
		return productRepository.findByName(name);
	}
	public Iterable<Product> getProductsByCategoryName(String name){
		return productRepository.findByCategoriesName(name);
	}
	public Optional<Product> getProduct(Integer id){
		return productRepository.findById(id);
	}
	
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}
	public void deleteProduct(Integer id) {
		productRepository.deleteById(id);
	}

}

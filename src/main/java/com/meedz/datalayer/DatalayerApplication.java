package com.meedz.datalayer;

import java.lang.StackWalker.Option;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.meedz.datalayer.model.Category;
import com.meedz.datalayer.model.Comment;
import com.meedz.datalayer.model.Product;
import com.meedz.datalayer.service.CategoryService;
import com.meedz.datalayer.service.CommentService;
import com.meedz.datalayer.service.ProductService;

@SpringBootApplication
public class DatalayerApplication implements CommandLineRunner{
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private CommentService commentService;

	public static void main(String[] args) {
		SpringApplication.run(DatalayerApplication.class, args);
	}

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Iterable<Product> products = productService.getProducts();
//		Iterable<Category> categories = categoryService.getCategories();
//		Iterable<Comment> comments = commentService.getComments();
		
//		Optional<Product> optProduct = productService.getProduct(7);
//		Product product = optProduct.get();
//		System.out.println(product.getName());
//		System.out.println("####");
//		product.getCategories().forEach(pcategorie -> System.out.println(pcategorie.getName()));
//		product.getComments().forEach(pcomment -> System.out.println(pcomment.getContent()));
		
//		System.out.println("--------");
//		Optional<Category> optCategory = categoryService.getCategory(1);
//		Category category = optCategory.get();
//		System.out.println(category.getName());
//		System.out.println("$$$$$$");
//		category.getProducts().forEach(cproduct -> System.out.println(cproduct.getName()));
		
//		Optional<Comment> optComment = commentService.getComment(1);
//		Comment comment = optComment.get();
//		System.out.println(comment.getContent());
//		System.out.println("$$$$$$");
//		System.out.println(comment.getProduct().getName());
		
//		Comment newComment = new Comment();
//		newComment.setContent("Assurance extraordinaire!");
//		product.addComment(newComment);

//		newComment = commentService.addComment(newComment);
		
//		commentService.getComments().forEach(mesComments -> System.out.println(mesComments));
		
//		System.out.println("--------");
		
		
//		System.out.println(newComment.getProduct().getName());
		
		
		
		
		
		
		
//		product.getComments().forEach(comment -> System.out.println(comment.getContent()));
		
		
		
//		System.out.println("--------");
//		System.out.println(comment.getContent());
		
		
//		products.forEach(product -> System.out.println(product.getName()));
//		System.out.println("--------");
//		categories.forEach(category -> System.out.println(category.getName()));
//		System.out.println("--------");
//		comments.forEach(comment -> System.out.println(comment.getContent()));
		
//		categoryService.getCategories().forEach(category -> System.out.println(category.getName()));
//		Category newCategory = new Category();
		
//		System.out.println("--------");
//		newCategory.setName("Professionnel");
//		newCategory = categoryService.addCategory(newCategory);
		
//		categoryService.getCategories().forEach(category -> System.out.println(category.getName()));
		
//		productService.getProducts().forEach(product -> System.out.println(product.getName()));
//		System.out.println("--------");
//		Product newproduct = new Product();
//		newproduct.setName("AssuranceAuTiersFidelite");
//		newproduct.setDescription("Les garanties de l'assurance au tiers à un prix moindre grâce à votre fidélité!");
//		newproduct.setCost(1100);
		
//		newCategory.addProduct(newproduct);
//		
//		newproduct = productService.addProduct(newproduct);
//		
//		productService.getProducts().forEach(product -> System.out.println(product.getName()));
//		
//		newproduct.getCategories().forEach(category -> System.out.println(category.getName()));
		
		
		
		//NEW CODE GITHUB
		
		/*
		categoryService.getCategories().forEach(
				category -> System.out.println(category.getName()));
		
		Category newCategory = new Category();
		newCategory.setName("Promotionne");
		
		newCategory = categoryService.addCategory(newCategory);
		
		categoryService.getCategories().forEach(
				category -> System.out.println(category.getName()));
		
		Product newProduct = new Product();
		newProduct.setName("nnnAssuranceAuTiersFidelite");
		newProduct.setDescription("nnnLes garanties de l'assurance au tiers à un prix moindre grâce à votre fidélité!");
		newProduct.setCost(1100);
		
		newCategory.addProduct(newProduct);
		
		newProduct = productService.addProduct(newProduct);
		
		productService.getProducts().forEach(
				product -> System.out.println(product.getName()));

		newProduct.getCategories().forEach(
				category -> System.out.println(category.getName()));
		
		Comment newComment = new Comment();
		newComment.setContent("nnAssurance extraordinaire!");
		newProduct.addComment(newComment);

		commentService.addComment(newComment);
		*/
		
//		Product existingProduct = productService.getProduct(1).get();
//		System.out.println("Avant");
//		System.out.println(existingProduct.getCost());
//		
//		existingProduct.setCost(3500);
//		productService.addProduct(existingProduct);
//		
//		existingProduct = productService.getProduct(1).get();
//		System.out.println("Après");
//		System.out.println(existingProduct.getCost());

//		System.out.println("AVANT SUPPRESSION");
//		Iterable<Product> products = productService.getProducts();
//		products.forEach(product -> System.out.println(product.getName()));
//		
//		productService.deleteProduct(8);
//		System.out.println("APRES SUPPRESSION");
//		products.forEach(product -> System.out.println(product.getName()));
		
//		Iterable<Product> searchResults = productService.getProductsByName("AssuranceTousRisques");
//		searchResults.forEach(result -> System.out.println(result.getProductId()));
		
		Iterable<Product> searchResultsCate = productService.getProductsByCategoryName("Standard");
		searchResultsCate.forEach(result -> System.out.println(result.getName()));
	}

}

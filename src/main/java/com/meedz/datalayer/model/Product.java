package com.meedz.datalayer.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;

@DynamicUpdate
@Data
@Entity
@Table(name="produit")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="produit_id")
	private int productId;
	
	@Column(name="nom")
	private String name;
	
	@Column(name="description")
	private String description;
	
	
	@Column(name="cout")
	private int cost;
	
	
	@OneToMany(
			mappedBy = "product",
			cascade = CascadeType.ALL,
			orphanRemoval = true
			)
	private List<Comment> comments = new ArrayList<>();
	
	
	@ManyToMany(
			mappedBy = "products",
			cascade = {
					CascadeType.PERSIST,
					CascadeType.MERGE
			}
		)
	private List<Category> categories = new ArrayList<>();
	
	
	//HELPERS
	public void addComment(Comment comment) {
		comments.add(comment);
		comment.setProduct(this);
	}
 
	public void removeComment(Comment comment) {
		comments.remove(comment);
		comment.setProduct(null);
	}

}

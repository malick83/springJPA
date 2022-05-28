package com.meedz.datalayer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meedz.datalayer.model.Comment;
import com.meedz.datalayer.repository.CommentRepository;

@Service
public class CommentService {
	
	@Autowired
	private CommentRepository commentRepository;
	
	public Iterable<Comment> getComments(){
		return commentRepository.findAll();
	}
	
	public Optional<Comment> getComment(Integer id){
		return commentRepository.findById(id);
	}
	
	public Comment addComment(Comment comment) {
		return commentRepository.save(comment);
	}
	
	public void deleteComment(Integer id) {
		commentRepository.deleteById(id);
	}

}

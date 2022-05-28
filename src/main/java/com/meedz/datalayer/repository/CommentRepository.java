package com.meedz.datalayer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meedz.datalayer.model.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer>{

}

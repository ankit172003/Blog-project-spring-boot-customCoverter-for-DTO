package com.practice.BlogProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.BlogProject.Entity.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer>{
	

}

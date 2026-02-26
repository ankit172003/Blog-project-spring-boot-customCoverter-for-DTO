package com.practice.BlogProject.Service;

import java.util.List;


import com.practice.BlogProject.Entity.Blog;
import com.practice.BlogProject.dto.BlogDto;


public interface BlogService {
	

	BlogDto saveBlog(Blog blog);
	
	List<BlogDto> getAllBlog();
	
	BlogDto getBlogById(Integer blogId) throws Exception;
	
	BlogDto getBlogAfterDeleting(Integer blogId) throws Exception;
	
	BlogDto updateBlog(Integer BlogId, Blog blog) throws Exception;
}

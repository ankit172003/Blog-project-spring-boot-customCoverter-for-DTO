package com.practice.BlogProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.BlogProject.Entity.Blog;
import com.practice.BlogProject.Service.BlogService;
import com.practice.BlogProject.dto.BlogDto;

@RestController
@RequestMapping("/api/v2")
public class BlogController {
	
	@Autowired
	private BlogService blogService;
	
	/*
	 * save
	 * getAll
	 * getBlogById
	 * DeleteById and get after deleteting
	 * updateBlog
	 * 
	 */
	
	@PostMapping("/add")
	public ResponseEntity<BlogDto> addBlog (@RequestBody Blog blog){
		BlogDto b = blogService.saveBlog(blog);
		return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(b);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<BlogDto>> getAllBlogs(){
		List<BlogDto> blogs = blogService.getAllBlog();
		return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(blogs);
	}
	
	@GetMapping("/blog/{id}")
	public ResponseEntity<BlogDto> getBlogById(@PathVariable Integer id) throws Exception{
		BlogDto blog = blogService.getBlogById(id);
		return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(blog);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<BlogDto> deleteById(@PathVariable Integer id) throws Exception{
		BlogDto blog = blogService.getBlogAfterDeleting(id);
		return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(blog);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<BlogDto> updateBlog(@PathVariable Integer id, @RequestBody Blog blog) throws Exception{
		BlogDto b = blogService.updateBlog(id, blog);
		return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(b);
	}
}

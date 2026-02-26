package com.practice.BlogProject.Service.Imp;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.practice.BlogProject.Converter.BlogConverter;
import com.practice.BlogProject.Entity.Blog;
import com.practice.BlogProject.Repository.BlogRepository;
import com.practice.BlogProject.Service.BlogService;
import com.practice.BlogProject.dto.BlogDto;

@Service
public class BlogServiceImpl implements BlogService{

	private BlogRepository blogRepository;
	
	private BlogConverter blogConvert;
	
	public BlogServiceImpl(BlogRepository blogRepository,BlogConverter blogConvert) {
		this.blogRepository=blogRepository;
		this.blogConvert=blogConvert;
	}
	
	
	@Override
	public BlogDto saveBlog(Blog blog) {
		Blog b = blogRepository.save(blog);
		return blogConvert.convert(b);
	}

	@Override
	public List<BlogDto> getAllBlog() {
		List<Blog> blogs = blogRepository.findAll();
		return blogConvert.convert(blogs);
	}

	@Override
	public BlogDto getBlogById(Integer blogId) throws Exception {
		Blog b = blogRepository.findById(blogId).orElseThrow(() -> new Exception("No Blog with this id"));
		return blogConvert.convert(b);
	}

	@Override
	public BlogDto getBlogAfterDeleting(Integer blogId) throws Exception {
		Optional<Blog> b = blogRepository.findById(blogId);
		if(b.isEmpty()) {
			throw new Exception("no blog with this id");
		}
		blogRepository.deleteById(blogId);
		return blogConvert.convert(b.get());
	}

	@Override
	public BlogDto updateBlog(Integer BlogId, Blog blog) throws Exception {
		Optional<Blog> b = blogRepository.findById(BlogId);
		if(b.isEmpty()) {
			throw new Exception("no such id");
		}
		Blog b1 = b.get();
		b1.setAuthorName(blog.getAuthorName());
		b1.setBlogContent(blog.getBlogContent());
		b1.setBlogTitle(blog.getBlogTitle());
		blogRepository.saveAndFlush(b1);
		return blogConvert.convert(b1);
	}

}

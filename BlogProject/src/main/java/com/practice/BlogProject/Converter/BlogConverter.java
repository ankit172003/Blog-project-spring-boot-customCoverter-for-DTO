package com.practice.BlogProject.Converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.practice.BlogProject.Entity.Blog;
import com.practice.BlogProject.dto.BlogDto;

@Component
public class BlogConverter {

	public BlogDto convert(Blog blog) {
		BlogDto b = new BlogDto();		
		
		b.setBlogTitle(blog.getBlogTitle());
		b.setAuthorName(blog.getAuthorName());
		b.setBlogContent(blog.getBlogContent());
		
		return b;
	}
	

	public List<BlogDto> convert(List<Blog> blogs) {
		List<BlogDto> blogsD = new ArrayList<>();
		
		for(Blog b: blogs) {
			BlogDto bDTO = new BlogDto();

			bDTO.setBlogTitle(b.getBlogTitle());
			bDTO.setAuthorName(b.getAuthorName());
			bDTO.setBlogContent(b.getBlogContent());
			
			blogsD.add(bDTO);
		}
		
		
		return blogsD;
	}
}

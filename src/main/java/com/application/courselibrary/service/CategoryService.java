package com.application.courselibrary.service;

import com.application.courselibrary.entity.Author;
import com.application.courselibrary.entity.Books;
import com.application.courselibrary.entity.Category;
import com.application.courselibrary.repository.BookRepository;
import com.application.courselibrary.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository  categoryRepository;

    public List<Category> finAllBooks(){
        return categoryRepository.findAll();

    }

    public Category findCategoryById(Long id){
        Category category= categoryRepository.findById(id).orElseThrow(()-> new RuntimeException("Author not found"));
        return category;
    }
    public void createCategory(Category categories){
        categoryRepository.save(categories);
    }
    public void updateCategory(Category categories){
        categoryRepository.save(categories);
    }
    public void deleteCategory(Long id){
       Category category= categoryRepository.findById(id).orElseThrow(()-> new RuntimeException("Book not found"));
        categoryRepository.deleteById(category.getId());
    }
}

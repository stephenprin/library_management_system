package com.application.courselibrary.service;

import com.application.courselibrary.entity.Books;
import com.application.courselibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Books> finAllBooks(){
        return bookRepository.findAll();

    }

    public Books findBooksById(Long id){
        Books books= bookRepository.findById(id).orElseThrow(()-> new RuntimeException("Book not found"));
        return books;

    }
    public void createBooks(Books books){
        bookRepository.save(books);
    }
    public void deleteBooks(Long id){
        Books books= bookRepository.findById(id).orElseThrow(()-> new RuntimeException("Book not found"));
        bookRepository.deleteById(books.getId());
    }
}

package com.example.thuchanh.service;

import com.example.thuchanh.exception.UserNotFoundException;
import com.example.thuchanh.model.Book;
import com.example.thuchanh.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public Book addBook(Book book){
        return bookRepository.save(book);
    }
    public List<Book> findAllBooks(){
        return bookRepository.findAll();
    }
    public  Book updateBook(Book book){
        return bookRepository.save(book);
    }
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }
    public Book findBookById(Long id) {
        return bookRepository.findEmployeeById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

}

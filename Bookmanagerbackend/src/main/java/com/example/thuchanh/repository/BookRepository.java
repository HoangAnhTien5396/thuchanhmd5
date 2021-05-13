package com.example.thuchanh.repository;

import com.example.thuchanh.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    void deleteBookById(Long id);

    Optional<Book> findEmployeeById(Long id);

}

package com.example.rajnish.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.rajnish.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
}
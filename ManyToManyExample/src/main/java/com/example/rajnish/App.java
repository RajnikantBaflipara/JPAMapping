package com.example.rajnish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.rajnish.model.Book;
import com.example.rajnish.model.Publisher;
import com.example.rajnish.repository.BookRepository;

@SpringBootApplication
public class App implements CommandLineRunner
{
	@Autowired
    private BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) {
        // Create a couple of Book and Publisher
        bookRepository.save(new Book("Book 1", new Publisher("Publisher A"), new Publisher("Publisher B")));
    }
}

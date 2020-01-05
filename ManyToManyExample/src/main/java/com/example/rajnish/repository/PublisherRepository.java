package com.example.rajnish.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.rajnish.model.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Integer>{
}
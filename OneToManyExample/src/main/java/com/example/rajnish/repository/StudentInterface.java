package com.example.rajnish.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rajnish.model.Student;

@Repository
public interface StudentInterface extends JpaRepository<Student, Long> {

}

package com.example.rajnish;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.example.rajnish.model.Address;
import com.example.rajnish.model.Student;
import com.example.rajnish.repository.AddressRepository;
import com.example.rajnish.repository.StudentInterface;

@SpringBootApplication
public class App implements CommandLineRunner
{
	@Autowired
	AddressRepository addressRepository;
	
	@Autowired
	StudentInterface studentInterface;
	
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

    @Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Address ad=new Address("Surat", "Maharastra", "394101");
		List<Student> students=new ArrayList();
		
		students.add(new Student("Rajnikant",ad));
		students.add(new Student("Sarita",ad));
		students.add(new Student("Vikram",ad));
		
		
		ad.setStudents(students);
//		studentInterface.save(st1);
//		studentInterface.save(st2);
//		studentInterface.save(st3);
		addressRepository.save(ad);		
	}
}

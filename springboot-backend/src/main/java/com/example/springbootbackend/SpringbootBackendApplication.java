package com.example.springbootbackend;

import com.example.springbootbackend.model.Employee;
import com.example.springbootbackend.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;


	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Bauyrzhan");
//		employee.setLastName("Tursynbek");
//		employee.setEmailId("bauka1215@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("John");
//		employee1.setLastName("Manhattan");
//		employee1.setEmailId("manhattanb@gmail.com");
//		employeeRepository.save(employee1);
	}
}

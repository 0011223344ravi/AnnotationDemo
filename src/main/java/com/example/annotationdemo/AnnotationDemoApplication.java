package com.example.annotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnotationDemoApplication  {

	@Autowired
	private Student student ;
	public static void main(String[] args) {
		SpringApplication.run(AnnotationDemoApplication.class, args);

	}

}

package com.example.annotationdemo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
     public Student getStudent (){

         return new Student();
     }

}

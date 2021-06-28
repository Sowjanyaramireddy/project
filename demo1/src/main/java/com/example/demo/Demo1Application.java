package com.example.demo;

import java.util.List;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	
//@Bean("cal")
 @Bean
 public Calculator calculator(List <Operation> operations )
 {
	 return new Calculator(operations);
 }
 @Bean
 public ApplicationRunner applicationRunner(Calculator calculator)
 {
	 return args -> {
	 calculator.calculate(10,20,'+');
	 calculator.calculate(100,20,'/');
	 calculator.calculate(10,3,'*');
	 };
 }

}

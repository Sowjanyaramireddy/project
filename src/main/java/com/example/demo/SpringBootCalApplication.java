package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringBootCalApplication {

	public static void main(String[] args) {
		ApplicationContext ac=
				SpringApplication.run(SpringBootCalApplication.class, args);
		Object ob=ac.getBean("operation");
		System.out.println(ob);
		
	}
}

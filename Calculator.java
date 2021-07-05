package com.example.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {

	@RequestMapping(value="/",method=RequestMethod.GET)
	
		public String getData(@RequestParam(value="name1",defaultValue="40") int name1 ,@RequestParam(value="name2",defaultValue="30") int name2) 
	{
		return "[Addition of two numbers is "+(name1+name2)+","
				+ "Substraction of two numbers is "+(name1-name2)+","
						+ "Multiply of two numbers is "+(name1*name2)+"]";
	}
        
}
package com.example.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Operation {
    @Value("${my.cal.num1}")
	 private int num1;
	@Value("${my.cal.num2}")
	 private int num2;
	 private char opt;
	 private int result;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	@Override
	public String toString() {
		return "Operation = [Add=" + (num1+num2) + ", Sub=" + (num1-num2) + ",Mul="+ (num1*num2) + ",Div="+ (num1/num2) +"]";
	}


}

	
	
	
	
	


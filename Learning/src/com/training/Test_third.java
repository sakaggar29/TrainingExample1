package com.training;
import java.util.Scanner;


public class Test_third {

	public static void main(String[] args) {
	
		Third t=new Third();
		
		int number;
		String brand;
		boolean if_value;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		number=in.nextInt();
		System.out.println("Enter the String:");
		brand=in.next();
		System.out.println("Enter the boolean value:");
		if_value=in.nextBoolean();
		
		t.set_brand(brand);
		t.set_ifvalue(if_value);
		t.set_number(number);
	
		System.out.println("The brand name is :"+t.get_brand());
		System.out.println("The boolean value is :"+t.get_ifvalue());
		System.out.println("The numeral value is :"+t.get_number());
		
	}

}

package com.training;

public class TestSuperSub {
	
	public static superclass func3()
	{
		SubClass s1=new SubClass();
		return s1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		superclass s=func3();
		SubClass s1=(SubClass)s;
		System.out.println(s1.hashCode());
		System.out.println(s.hashCode());
		

	}

}

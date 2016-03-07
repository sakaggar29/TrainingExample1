package com.training;

public class Testmain {

	public static void fun(Test t)
	{
		t.setNumber(2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			TestInherit t = new TestInherit();
			t.setNum(1);
			System.out.println("The number is :"+t.getNum());
			//t.setNumber(2);
			t.setNumber(6);
			System.out.println("The num is :"+t.getNumber());
			System.out.println("The number is :"+t.number);
			Test T1=new TestInherit();
			fun(T1);
			
	}

	
	
}

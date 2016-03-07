package com.training;

public class TestInherit extends Test {

	public int num=9;
	
	public Integer number;

	public int getNum() {
		System.out.println("The superClass no is :"+super.getNum());
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public TestInherit(){
		this.number = 23;
	}
	


}

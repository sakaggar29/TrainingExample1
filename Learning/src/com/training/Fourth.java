package com.training;

public class Fourth {

	int[] locationCells;
	int numofhits;
	
	public void setLocationCells(int[] locs){
		locationCells=locs;
	}
	
	public void checkYourself()
	{
		for(int cell : locationCells)
		{
			System.out.println("The value of cell is :"+cell);
		}
	}
	
	public void test()
	{
		System.out.println("What d beep beep is going on!!!");
	}
	
	
}

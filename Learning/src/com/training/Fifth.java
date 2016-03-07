package com.training;

import java.util.ArrayList;
import java.util.List;


public class Fifth {
	
	private List<Fifthnew> myList = new ArrayList<Fifthnew>();
	List<Integer>lists = new ArrayList<Integer>();
	List<Integer>lists1 = new ArrayList<Integer>();
	public void runList(){
		
		Fifthnew f1=new Fifthnew();
		Fifthnew f2=new Fifthnew();
		Fifthnew f3=new Fifthnew();
		
	
		lists.add(1);
		lists.add(2);
		lists.add(3);
		
		lists1.add(4);
		lists1.add(5);
		lists1.add(6);
		
		f1.setList2(lists);
		f2.setList2(lists1);
		
		myList.add(f1);
		myList.add(f2);
	/*	myList.add(f3);*/
	}	
	
	public void show()
	{
		for(Fifthnew f : myList)
		{
			System.out.println("The number is :"+f.getList2());
		}
	}
	
	
}

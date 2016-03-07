package com.training;

import java.awt.List;
import java.util.ArrayList;

public class ArrTtest {
	
	public static void main(String[] args){
		
		ArrTest1 a=new ArrTest1();
		ArrTest b=new ArrTest();
		ArrTest c=new ArrTest();
		ArrayList<ArrTest> arr1=new ArrayList<ArrTest>();
		arr1.add(a);
		arr1.add(b);
		ArrTest s=arr1.get(0);
		ArrTest i=arr1.get(1);
	/*	s.func2(); */    //Won't compile
		ArrTest1 t=(ArrTest1) s;
		if(s instanceof ArrTest1)
		{
			System.out.println("jgvdkfj");
		}
		
		if(i instanceof ArrTest1)
		{
			System.out.println("in other");
		}
		t.func1();
		t.func2();
	/*	ArrTest1 j=(ArrTest1) i;		We can't do this
		j.func2();
		j.func1();
*/
		
		
	}

}

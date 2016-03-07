package com.training;

public class Test_Fourth {

	public static void main(String[] args) {
		
		Fourth f=new Fourth();
		int[] arr= new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=30;
		f.setLocationCells(arr);
		f.checkYourself();
		
		Fourth[] f1=new Fourth[4];
		f1[0]=new Fourth();
		f1[0].test();

	}

}

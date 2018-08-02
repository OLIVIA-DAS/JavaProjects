package com.deloitte.main;

public class MainClass {

	public static void main(String[] args) {
		
//1D array		
		int num[];
		num=new int[10];
		
		num[5]=4;	
		System.out.println(num[5]);
		System.out.println(num.length);
		for(int target:num)
			System.out.println(target);
		
//2D arrays
		int num2[][];
		num2=new int[2][2];
		num2[0][0] = 1;
		num2[0][1] = 2;
		num2[1][0] = 3;
		num2[1][1] = 4;
		
		
		for(int[] i:num2)
			for(int j:i)
				System.out.print(j);
		System.out.println(" ");
	}
		
}

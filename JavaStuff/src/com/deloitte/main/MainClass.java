  package com.deloitte.main;

class Point{
	public int x;
	public int y;
}
public class MainClass {
	
	public static void main(String[] args) {
		Point p1,p2;
		
		p1=new Point();
		p1.x=10;
		p1.y=20;
		System.out.println(p1.x +"\t" + p1.y);
 		p2=p1;
		System.out.println(p2.x +"\t" + p2.y);
		
		p1.x=24;
		p1.y=12;
		System.out.println(p2.x +"\t" + p2.y);
		
		p1=new Point();
		p1.x=24;
		p1.y=12;
		System.out.println(p2.x +"\t" + p2.y);

		

	}

}

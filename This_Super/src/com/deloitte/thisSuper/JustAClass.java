package com.deloitte.thisSuper;

 class Point{
	public int x;
	public int y;
	
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	

	@Override
	public boolean equals(Object tar) {
		if(tar!= null) {
			if (tar instanceof Point) {
				Point poi = (Point) tar;
				if(x== poi.x && y== poi.y)
				return true;
			}
		}
		
		// TODO Auto-generated method stub
		return false;
	}
	
}




public class JustAClass {

	public static void main(String[] args) {
		Point p1= new Point(2,4);
		Point p2 = new Point(2,4);
		System.out.println(p1.equals(p2));
		// TODO Auto-generated method stub

	}

}

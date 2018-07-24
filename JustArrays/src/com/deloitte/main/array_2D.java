package com.deloitte.main;

public class array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Point[] point;
      point = new Point[3];
      
      
      point[0] = new Point();
      point[1] = new Point();
      point[2] = new Point();
      
      point[0].x = 1;
      point[0].y = 2;
      point[1].x = 3;
      point[1].y = 4;
      point[2].x = 5;
      point[2].y = 6;
      
      for(Point points:point) {
    	  System.out.println(points.x + " " + points.y);
    	  
    	  
      }
	}

}

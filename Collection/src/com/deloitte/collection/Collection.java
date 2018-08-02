package com.deloitte.collection;

class Point<T>{
	private T x;
	private T y;
	
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	
	
}




public class Collection {

	public static void main(String[] args) {
		Point<Float> point1 = new Point<Float>();
		point1.setX(7.9f);
		point1.setY(7.4f);
		System.out.println(point1.getX() +"  "+ point1.getY());
		Point<Integer> point2 = new Point<Integer>();
		point2.setX(6);
		point2.setY(2);
		System.out.println(point2.getX() +"  "+ point2.getY());
		


	}

}

package com.deloitte.flyer;

import com.deloitte.others.Animal;

public class Bird extends Animal implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("bird taking off");
		// TODO Auto-generated method stub

	}

	@Override
	public void land() {
		System.out.println("bird landing");
		// TODO Auto-generated method stub

	}

	@Override
	public void fly() {
		System.out.println("bird flying");
		// TODO Auto-generated method stub

	}
	public void buildNest() {
		
		System.out.println("building nest");
	}
	public void layEggs() {
		
		System.out.println("laying eggs");
	}

}

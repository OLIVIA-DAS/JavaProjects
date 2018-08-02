package com.deloitte.flyer;

import com.deloitte.others.Vehicle;

public class Airplane extends Vehicle implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("taking off");
		// TODO Auto-generated method stub

	}

	@Override
	public void land() {
		System.out.println("Landing");
		// TODO Auto-generated method stub

	}

	@Override
	public void fly() {
		System.out.println("flying");
		// TODO Auto-generated method stub

	}

}

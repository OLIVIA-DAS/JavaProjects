package com.deloitte.others;

import com.deloitte.flyer.Flyer;

public class Airport {

	public static void main(String[] args) {
		Airport metropolisAirport = new Airport();
		Helicopter copter = new Helicopter();
		SeaPlane sPlane = new SeaPlane();
		
		metropolisAirport.givePermissionToLand(copter);
		metropolisAirport.givePermissionToLand(sPlane);
		// TODO Auto-generated method stub

	}
    private void givePermissionToLand(Flyer f) {
    	
    	
    }
}

package com.automobile.FourWheeler;
import com.automobile.Vehicle;

public class Ford extends Vehicle{
	
	public int speed() {
		return 120;
	}
	
	public int tempControl() {
		return 42;
	}
	
	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "Fiesta";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "8907";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "FordName";
	}
	
}

/*

Add the following ideas to the previous hands on: 
Create FourWheelersubpackage under Automobile package
Logan class extends com.automobile.vehicle class
public int speed()
– Returns the current speed of the vehicle.
public intgps() 
– provides facility to control the gps device 
Ford class extends  com.automobile.vehicle class
public int speed()
– Returns the current speed of the vehicle.
public inttempControl() 
– provides facility to control the air conditioning device which is available in the car

*/
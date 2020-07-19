package com.automobile.twoWheeler;
import com.automobile.Vehicle;

public class Hero extends Vehicle{
	
	public int getSpeed() {
		return 1;
	}
	
	public void radio() {
		System.out.println("Radio");
	}

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "HeroCity";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "Hero123";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "HeroName";
	}
}

 /*
  
Create TwoWheelersubpackage under Automobile package
Hero  class extends  Automobile.vehicle class 
public intgetSpeed() 
– Returns the current speed of the vehicle.
public void radio() 
– provides facility to control the radio device 
Honda class extends com.automobile.vehicle class
public intgetSpeed()
– Returns the current speed of the vehicle.
public void cdplayer() 
– provides facility to control the cd player device which is available in the car.
Create a test class to test the methods available in all these child class. 
  
*/
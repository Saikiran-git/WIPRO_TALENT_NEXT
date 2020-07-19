package com.automobile;

abstract public class Vehicle {
	abstract public String getModelName();
	abstract public String getRegistrationNumber(); 
	abstract public String getOwnerName();
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
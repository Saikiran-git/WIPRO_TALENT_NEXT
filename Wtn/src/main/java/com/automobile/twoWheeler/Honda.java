package com.automobile.twoWheeler;
import com.automobile.Vehicle;

public class Honda extends Vehicle{
	
	public int getSpeed() {
		return 2;
	}

	public void cdplayer() {
		System.out.println("cdplayer");
	}
	
	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "HondaCity";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "Honda123";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "HondaName";
	}
	
}

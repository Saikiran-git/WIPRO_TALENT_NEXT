package com.automobile;
import com.automobile.FourWheeler.Ford;
import com.automobile.FourWheeler.Logan;
import com.automobile.twoWheeler.*;

public class Test {
	public static void main(String[] args) {
		Hero hero = new Hero();
		Honda honda = new Honda();
		System.out.println(hero.getSpeed());
		hero.radio();
		System.out.println(hero.getModelName());
		System.out.println(hero.getRegistrationNumber());
		System.out.println(hero.getOwnerName());
		System.out.println(honda.getSpeed());
		honda.cdplayer();
		System.out.println(honda.getModelName());
		System.out.println(honda.getRegistrationNumber());
		System.out.println(honda.getOwnerName());
		Logan logan = new Logan();
		Ford ford = new Ford();
		System.out.println(logan.speed());
		System.out.println(logan.gps());
		System.out.println(logan.getModelName());
		System.out.println(logan.getRegistrationNumber());
		System.out.println(logan.getOwnerName());
		System.out.println(ford.speed());
		System.out.println(ford.tempControl());
		System.out.println(ford.getModelName());
		System.out.println(ford.getRegistrationNumber());
		System.out.println(ford.getOwnerName());
	}
}

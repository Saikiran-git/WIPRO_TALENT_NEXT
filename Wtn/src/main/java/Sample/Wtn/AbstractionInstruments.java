package Sample.Wtn;

abstract class Instrument{
	abstract public void play();
}

class Piano extends Instrument{
	
	@Override
	public void play() {
		System.out.println("Piano is playing  tan tan tan tan");
	}
	
}

class Flute extends Instrument{
	
	@Override
	public void play() {
		System.out.println("Flute is playing  toot toot toot toot");
	}
	
}

class Guitar extends Instrument{
	
	@Override
	public void play() {
		System.out.println("Guitar is playing  tin  tin  tin");
	}
	
}

public class AbstractionInstruments {

	public static void main(String[] args) {
		Instrument ins[] = new Instrument[10];
		for(int i = 0; i < 10; i++) {
			if(i == 1 || i == 5 || i == 9) 
				ins[i] = new Piano();
			else if(i == 3 || i == 4 || i == 7)
				ins[i] = new Flute();
			else
				ins[i] = new Guitar();
			
			ins[i].play();
			
			if(ins[i] instanceof Piano) 
				System.out.println("InstanceOf Piano"); 
			else if(ins[i] instanceof Flute) 
				System.out.println("InstanceOf Flute"); 
			else 
				System.out.println("InstanceOf Guitar"); 
			
			System.out.println();
		}
	}

}

/*
 
Create an abstract class Instrument which is having the abstract function play. 

Create three more sub classes from Instrument which is Piano, Flute, Guitar. 
Override the play method inside all three classes printing a message 
“Piano is playing  tan tan tan tan  ”  for Piano class
“Flute is playing  toot toot toot toot”  for Flute class
“Guitar is playing  tin  tin  tin ”  for Guitar class 

Create an array of 10 Instruments.
Assign different type of instrument to Instrument reference.
Check for the polymorphic behavior of  play method.
Use the instanceof operator to print which object is stored at which index of instrument array.
  
 */

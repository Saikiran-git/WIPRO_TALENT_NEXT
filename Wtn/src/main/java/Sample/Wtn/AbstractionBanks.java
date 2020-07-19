package Sample.Wtn;

abstract class GeneralBank{
	
	public abstract int getSavingsInterestRate();
	
	public abstract double getFixedDepositInterestRate();

}

class ICICIBank extends GeneralBank{

	@Override
	public int getSavingsInterestRate() {
		return 4;
	}

	@Override
	public double getFixedDepositInterestRate() {
		return 8.5;
	}
	
}

class KotMBank extends GeneralBank{

	@Override
	public int getSavingsInterestRate() {
		return 6;
	}

	@Override
	public double getFixedDepositInterestRate() {
		return 9;
	}
	
}

public class AbstractionBanks {

	public static void main(String[] args) {
		ICICIBank ib = new ICICIBank();
		System.out.println(ib.getSavingsInterestRate());
		System.out.println(ib.getFixedDepositInterestRate());
		KotMBank kb = new KotMBank();
		System.out.println(kb.getSavingsInterestRate());
		System.out.println(kb.getFixedDepositInterestRate());
		GeneralBank gb = new ICICIBank();
		System.out.println(gb.getSavingsInterestRate());
		System.out.println(gb.getFixedDepositInterestRate());
		GeneralBank g = new KotMBank();
		System.out.println(g.getSavingsInterestRate());
		System.out.println(g.getFixedDepositInterestRate());
		
	}

}


/*
  
  Create a class called GeneralBank that acts as base class for all banks. 
  This class has getSavingsInterestRate and getFixedDepositInterestRate methods, 
  which returns the savings account interest rate and fixed deposit account interest 
  rate that the specific bank gives. Since GeneralBank cannot say what percentage which 
  bank would give, make these methods abstract.

Create two subclasses of GeneralBank called ICICIBank and KotMBank.
 Override the inherited methods from the base class. The following are the interest rates of these banks.
ICICIBank - Savings 4% Fixed 8.5% and 
KotMBank - Savings 6% Fixed 9%.

Create a main method to test the above classes and their methods. 
Try one by one and observe your findings

a) ICICIBank i=new ICICIBank();

b) KotMBank k=new KotMBank();

c) GeneralBank g=new KotMBank();

d) GeneralBank g=new ICICIBank(); 
 
 */
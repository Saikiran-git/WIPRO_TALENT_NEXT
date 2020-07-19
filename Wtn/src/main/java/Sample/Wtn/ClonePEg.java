package Sample.Wtn;

class CloneSub1 implements Cloneable{//
	int c;//
	int d;//
}//

class CloneSub implements Cloneable{
	int a;
	double b;
	CloneSub1 ab = new CloneSub1();//
	
	CloneSub cloneTest() {
		try {
			CloneSub cl = (CloneSub) super.clone();///
			cl.ab = new CloneSub1();///
			return (CloneSub) super.clone();
			//return cl;//
		}
		catch(CloneNotSupportedException e) {
			System.out.println("Cloning not allowed");
			return this;
		}	
	}
}

public class ClonePEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloneSub cs = new CloneSub();
		CloneSub cs1;
		cs.a = 10;
		cs.b = 20;
		cs.ab.c = 30;//
		cs.ab.d = 40;//
		cs1 = cs.cloneTest();
		cs1.ab.c = 1000;
		cs1.ab.d = 2000;
		System.out.println("cs: " +cs.a+" "+cs.b+" "+cs.ab.c+" "+cs.ab.d);//
		System.out.println("cs1: " +cs1.a+" "+cs1.b+" "+cs1.ab.c+" "+cs1.ab.d);//
		cs.a = 100;
		cs.b = 200;
		cs.ab.c = 300;//
		cs.ab.d = 400;//
		System.out.println("cs: " +cs.a+" "+cs.b+" "+cs.ab.c+" "+cs.ab.d);//
		System.out.println("cs1: " +cs1.a+" "+cs1.b+" "+cs1.ab.c+" "+cs1.ab.d);//		
	}

}

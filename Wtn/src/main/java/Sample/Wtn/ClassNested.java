package Sample.Wtn;

public class ClassNested {
	
	final static int a = 5;
	final static int b = 10;
	class ABC{
		void Area() {
			System.out.println(a * b);
		}
	}
	
	public static void main(String[] args) {
		ClassNested sn = new ClassNested();
		ClassNested.ABC nes = sn.new ABC();
		nes.Area();
	}
	
}

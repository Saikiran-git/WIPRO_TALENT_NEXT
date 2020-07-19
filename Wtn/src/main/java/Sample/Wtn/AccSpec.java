package Sample.Wtn;

class AccessModifiers{
	int n = 20;
	private int pr = 49;
	public int pu = 10;
	protected int pro = 17;
	public int getPr() {
		return pr;
	}
	public void setPr(int pr) {
		this.pr = pr;
	}
}

public class AccSpec {
	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers();
		System.out.println("Private data is "+am.getPr()); // cannot be used outside the class
		System.out.println("Public data is "+am.pu); // can be accessed anywhere 
		System.out.println("Default data is "+am.n); //	can be accessed anywhere 
		System.out.println("Protected data is "+am.pro); //can be accessed within the package
	}
}

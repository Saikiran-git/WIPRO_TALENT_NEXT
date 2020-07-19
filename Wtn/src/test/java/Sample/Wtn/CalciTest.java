package Sample.Wtn;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalciTest {
	CalciProg c;
	 
	@Before 
	public void before() {
		c = new CalciProg();;
	}
	
	@After
	public void after() {
		c = null;
	}
	
	@Test
	public void testadd() {
		assertEquals("Output mismatch", 19, c.add(10, 9));
	}
	
	@Test
	public void testsub() {
		assertEquals("Output mismatch", 1, c.sub(10, 9));
	}

}

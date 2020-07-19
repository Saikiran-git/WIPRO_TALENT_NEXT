package JunitTests;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
public class CalculatorTest {
	Calculator c;
	@Before
	public void before() {
		c=new Calculator();
	}
	@After
	public void after() {
		c=null;
	}
	@Test
	public void Testadd() {
		assertEquals("Added",5,c.add(2,3));
	}
	@Test
	public void Testsub() {
		assertEquals("Added",-1,c.sub(2,3));
	}
}

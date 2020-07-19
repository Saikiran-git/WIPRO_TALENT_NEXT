package JunitTests;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class PrimeTest {
	Prime p;
	@Before
	public void before() {
		p = new Prime();
	}
	
	@After
	public void after(){
		p=null;
	}
	
	@Test
	public void testPrime() {
		assertEquals("Prime",true,p.prime(13));
	}
	
	@Test
	public void testPrime2() {
		assertEquals("Prime",true,p.prime(17));
	}
}

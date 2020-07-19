package JunitTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {
	@Test
	public void test() {
		assertEquals("Kiran",Employee.Emp());
	}

}

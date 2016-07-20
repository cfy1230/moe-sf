package fcu.sqa.maven_demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class addTest {


	@Test(expected = Exception.class)
//	@Test
	public void test() throws Exception {
		//fail("Not yet implemented");
		
		
		add a =new add();
		assertEquals(12,a.add1(5,7));
	}

}

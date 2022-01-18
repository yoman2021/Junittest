package ncyu._cal02;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcal {

	@Test
	public void testadd() {
		/*fail("Not yet implemented");*/
		int expertRusult = 5;

		cal F=new cal();
			
		assertEquals(expertRusult,F.Add(2, 3));
	}
	
	@Test
	public void testsub() {
		/*fail("Not yet implemented");*/
		int expertRusult = -1;

		cal F=new cal();
			
		assertEquals(expertRusult,F.sub(2, 3));
	}

	
	@Test
	public void testmul() {
		/*fail("Not yet implemented");*/
		int expertRusult = 6;

		cal F=new cal();
			
		assertEquals(expertRusult,F.mul(2, 3));
	}

}

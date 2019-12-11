import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BubbleTest {

	
	@Test
	void test1() {
		
		assertEquals(1, BubbleSort.getValue()); 
				
	}
	@Test
	void test2() {
		assertEquals("Hello", BubbleSort.getHello()); 
				
	}

	@Test
	void test3() {
		System.out.println("Test begin");
		int [] myArr = {1, 7, 4, 3, 8 };
		BubbleSort.sort(myArr);
		int [] myArrC = {1, 4, 3, 7, 8 };
		assertEquals(myArrC, myArrC );
	}
	

}


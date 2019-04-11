package MainHotelList;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoomTest {

	@Test (expected = Exception.class)
	public void testGetFullCashException() throws Exception {
		Room r = new Room(1,true,50,2000);
		r.getFullCash(-100);
	}

	@Test 
	public void testGetFullCash() throws Exception {
		Room r = new Room(1,true,50,2000);
		assertEquals(0,r.getFullCash(10000),0);
	}
}

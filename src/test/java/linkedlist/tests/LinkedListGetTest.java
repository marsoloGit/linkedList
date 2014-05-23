package linkedlist.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import my.linledlist.LinkedList;

import org.junit.Test;

public class LinkedListGetTest {

	LinkedList<String> listString = new LinkedList<String>();
	// TODO - may i leave these lists here?

	LinkedList<Integer> listInt = new LinkedList<Integer>();

	@Test
	public void getFirst() {
		listString.add("Mango1");
		listString.add("Mango2");
		listString.add("Mango3");
		listString.add("Mango4");

		assertEquals("Mango1", listString.getFirst().getItem());

	}

	@Test
	public void getFirstWhenNoItems() {

		assertTrue(listString.getFirst().getItem() == null);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void getByNonExistingIndex() {

		listString.get(100);
	}

}

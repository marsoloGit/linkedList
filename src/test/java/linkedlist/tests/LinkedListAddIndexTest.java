package linkedlist.tests;

import static org.junit.Assert.assertEquals;
import my.linledlist.LinkedList;

import org.junit.Test;

public class LinkedListAddIndexTest {

	LinkedList<String> listString = new LinkedList<String>();

	LinkedList<Integer> listInt = new LinkedList<Integer>();

	@Test
	public void addFirstItemTo0() {
		int size = listString.getSize();
		listString.add(0, "Mango");
		int updatedSize = listString.getSize();
		assertEquals(size + 1, updatedSize);
		assertEquals("Mango", listString.get(0).getItem());
	}

	@Test
	public void addItemToMiddle() {

		listString.add("Mango1");
		listString.add("Mango2");
		listString.add("Mango3");
		listString.add("Mango4");
		listString.add(2, "Mango");

		assertEquals("Mango", listString.get(2).getItem());
	}

	@Test
	public void addItemToEnd() {

		listString.add("Mango1");
		listString.add("Mango2");
		listString.add("Mango3");
		listString.add("Mango4");
		listString.add(4, "Mango");

		assertEquals("Mango", listString.get(listString.getSize() - 1)
				.getItem());
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void addToNegativeIndex() {

		listString.add("Mango1");
		listString.add("Mango2");
		listString.add("Mango3");
		listString.add("Mango4");
		listString.add(-4, "Mango");

	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void addToIndexMoreThanSize() {

		listString.add("Mango1");
		listString.add("Mango2");
		listString.add("Mango3");
		listString.add("Mango4");
		listString.add(100, "Mango");

	}

}
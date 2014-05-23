package linkedlist.tests;

import static org.junit.Assert.assertEquals;
import my.linledlist.LinkedList;

import org.junit.Test;

public class LinkedListDeleteTest {

	LinkedList<String> listString = new LinkedList<String>();

	LinkedList<Integer> listInt = new LinkedList<Integer>();

	@Test
	public void deleteFirstItem() {

		listString.add("Mango");
		listString.add("Apple");

		int size = listString.getSize();

		listString.delete(0);

		int updatedSize = listString.getSize();

		assertEquals(size - 1, updatedSize);
		assertEquals("Apple", listString.get(0).getItem());
	}

	@Test
	public void deleteMiddleItem() {

		listString.add("Mango1");
		listString.add("Mango2");
		listString.add("Mango3");
		listString.add("Mango4");
		listString.delete(2);

		assertEquals("Mango4", listString.get(2).getItem());
	}

	@Test
	public void deleteEndItem() {

		listString.add("Mango1");
		listString.add("Mango2");
		listString.add("Mango3");
		listString.add("Mango4");
		listString.delete(3);

		assertEquals("Mango3", listString.get(listString.getSize() - 1)
				.getItem());
	}

	@Test
	public void deleteAllItems() {

		listString.add("Mango1");
		listString.add("Mango2");
		listString.add("Mango3");
		listString.add("Mango4");
		listString.delete(0);
		listString.delete(0);
		listString.delete(0);
		listString.delete(0);

		assertEquals(0, listString.getSize());
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void deleteWhenNoElements() {

		listString.delete(0);

	}

}
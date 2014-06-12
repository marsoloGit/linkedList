package linkedlist.tests;

//todo should i ad null?

import static org.junit.Assert.assertEquals;
import my.linledlist.LinkedList;
import my.linledlist.Sandwich;

import org.junit.Test;

public class LinkedListAddTest {

	LinkedList<String> listString = new LinkedList<String>();

	LinkedList<Integer> listInt = new LinkedList<Integer>();

	@Test
	public void addOneItem() {
		int size = listString.getSize();

		listString.add("Mango");
		int updatedSize = listString.getSize();
		assertEquals(updatedSize, size + 1);
		assertEquals("Mango", listString.get(updatedSize - 1).getItem());
	}

	@Test
	public void add3Items() {
		int size = listString.getSize();

		String[] data = { "Mango", "Orange", "Apple" };

		for (String s : data) {

			listString.add(s);
			int updatedSize = listString.getSize();

			assertEquals(++size, updatedSize);
			assertEquals(listString.get(updatedSize - 1).getItem(), s);

		}
	}

	@Test
	public void addEqualItems() {
		int size = listString.getSize();

		String[] data = { "Mango", "Mango", "Mango" };

		for (String s : data) {

			listString.add(s);
			int updatedSize = listString.getSize();

			assertEquals(++size, updatedSize);
			assertEquals(listString.get(updatedSize - 1).getItem(), s);

		}
	}

	@Test
	public void addOneItemInteger() {
		int size = listInt.getSize();

		listInt.add(100);
		int updatedSize = listInt.getSize();

		assertEquals(updatedSize, size + 1);
		assertEquals(100, listInt.get(updatedSize - 1).getItem().intValue());
	}

	@Test
	public void addCustomType() {
		LinkedList<Sandwich> listSandwich = new LinkedList<Sandwich>();
		Sandwich sw = new Sandwich();
		sw.setBreadSize(66);
		int size = listSandwich.getSize();

		listSandwich.add(sw);
		int updatedSize = listSandwich.getSize();

		assertEquals(updatedSize, size + 1);
		assertEquals(sw.getBreadSize(), listSandwich.get(updatedSize - 1)
				.getItem().getBreadSize());
	}
}
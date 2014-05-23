package linkedlist.tests;

import my.linledlist.LinkedList;

import org.junit.Test;

public class LinkedListToStringTest {

	LinkedList<String> listString = new LinkedList<String>();

	LinkedList<Integer> listInt = new LinkedList<Integer>();

	@Test
	public void printOneItem() {

		listString.add("Mango");
		System.out.println(listString);

	}

	@Test
	public void print3Items() {

		listString.add("Mango1");
		listString.add("Mango2");
		listString.add("Mango3");

		System.out.println(listString);
	}

	@Test
	public void printZeroItems() {

		System.out.println(listString);
	}

}
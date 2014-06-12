package my.linledlist;

public class LinkedList<T> {

	public static class Element<X> {
		private X item;
		private Element<X> next;
		private Element<X> prev;

		Element(X item, Element<X> next, Element<X> prev) {
			this.item = item;
			this.next = next;
			this.prev = prev;

		}

		public X getItem() {
			return item;
		}

	}

	private final Element<T> zeroElement = new Element<T>(null, null, null);

	static int size = 0;

	public int getSize() {
		return size;
	}

	public LinkedList() {
		zeroElement.prev = zeroElement;
		zeroElement.next = zeroElement;
		zeroElement.item = null;
		size = 0;

	}

	public void add(T item) {
		Element<T> e = new Element<T>(item, zeroElement, zeroElement.prev);

		e.prev.next = e;
		e.next.prev = e;
		size++;

	}

	public void add(int index, T item) {

		if (size == 0 && index == 0) {
			add(item);
			return;
		}
		if (index > size || index < 0)
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: "
					+ size);

		Element<T> nodeNextToInserted = get(index);
		Element<T> newNode = new Element<T>(item, nodeNextToInserted,
				nodeNextToInserted.prev);

		newNode.prev.next = newNode;
		newNode.next.prev = newNode;

		size++;

	}

	public Element<T> getFirst() {

		return zeroElement.next;

	}

	public Element<T> get(int index) {
		if (index > size || index < 0)
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: "
					+ size);

		int count = 0;
		Element<T> searchedNode = getFirst();

		while (count != index) {
			searchedNode = searchedNode.next;
			count++;
		}
		return searchedNode;

	}

	@Override
	public String toString() {
		Element<T> node = getFirst();
		StringBuilder s = new StringBuilder();

		s.append("{");
		while (node.item != null) {
			s.append(node.item);
			s.append(",");
			node = node.next;

		}
		s.append("}");
		return s.toString();
	}

	public void delete(int index) {
		if (index > size - 1 || index < 0)
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: "
					+ size);

		Element<T> nodeTodelete = get(index);

		nodeTodelete.prev.next = nodeTodelete.next;
		nodeTodelete.next.prev = nodeTodelete.prev;
		size--;

	}

}

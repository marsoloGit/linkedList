package polymorphism;

class Meal {
	Meal() {
		System.out.println("Meal()");
	}
}

class Bread {
	private int size;

	Bread() {
		System.out.println("Bread()");
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

}

class Cheese {
	Cheese() {
		System.out.println("Cheese()");
	}
}

class Pickle {
	Pickle() {
		System.out.println("Pickle()");
	}
}

class Lettuce {
	Lettuce() {
		System.out.println("Lettuce()");
	}
}

class Lunch extends Meal {
	Lunch() {
		System.out.println("Lunch()");
	}
}

class PortableLunch extends Lunch {
	PortableLunch() {
		System.out.println("PortableLunch()");
	}
}

public class Sandwich extends PortableLunch {
	private final Bread b = new Bread();
	private final Cheese c = new Cheese();
	private final Lettuce l = new Lettuce();
	private final Pickle p = new Pickle();

	public Sandwich() {
		System.out.println("Sandwich()");
	}

	public int getBreadSize() {

		return b.getSize();
	}

	public void setBreadSize(int size) {

		this.b.setSize(size);
	}

	public static void main(String[] args) {
		new Sandwich().setBreadSize(4);
	}
}

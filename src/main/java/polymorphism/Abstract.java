package polymorphism;

abstract public class Abstract {

	/**
	 * @param args
	 */
	Abstract() {
		print();
	}

	abstract void print();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Abstract a = new Abstract(); // !cannot be done

		Derrived d = new Derrived();

	}

}

class Derrived extends Abstract {
	int k = 8;

	void print() {
		int i = 5;
		System.out.println(i);
		System.out.println(k);
	}

	public static void main(String[] args) {

	}

}
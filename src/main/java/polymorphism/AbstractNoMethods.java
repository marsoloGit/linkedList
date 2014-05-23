package polymorphism;

abstract public class AbstractNoMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Derrivedd extends AbstractNoMethods {
	static Derrivedd d = new Derrivedd();

	void method() {
		System.out
				.println("method is working for an initially base-classed element, downcasted to a derrived type");

	}

	static void downcast() {
		AbstractNoMethods b = new Derrivedd();
		((Derrivedd) b).method();
		// AbstractNoMethods a;
		// a = d;
		// Derrivedd c = (Derrivedd) a;
		// c.method();

	}

	public static void main(String[] args) {

		downcast();
	}
}

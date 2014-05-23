package polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Description {
	Description(String s) {
		System.out.println("creating Description for " + s);

	}
}

abstract public class Rodent {

	private final Description d = new Description("Basic Rodent");

	protected Rodent() {
		System.out.println("Rodent creation");
	}

	void eat() {
		System.out.println("Rodent is eating");

	}

	abstract void run();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Mouse extends Rodent {

	private final Description d = new Description("Mouse");

	Mouse() {
		System.out.println("Mouse creation");
	}

	@Override
	void eat() {
		System.out.println("Mouse is eating");

	}

	@Override
	void run() {
		System.out.println("Mouse is running");

	}

}

class Gerbil extends Rodent {

	private final Description d = new Description("Gerbil");

	Gerbil() {
		System.out.println("Gerbil creation");
	}

	@Override
	void eat() {
		System.out.println("Gerbil is eating");

	}

	@Override
	void run() {
		System.out.println("Gerbil is running");

	}
}

class Hamster extends Rodent {

	private final Description d = new Description("Hamster");

	Hamster() {
		System.out.println("Hamster creation");
	}

	@Override
	void eat() {
		System.out.println("Hamster is eating");

	}

	@Override
	void run() {
		System.out.println("Hamster is running");

	}

}

class Rodents {

	public static void main(String[] args) {
		Rodent[] r = { new Mouse(), new Gerbil(), new Hamster() };
		for (int i = 0; i < 3; i++) {
			r[i].eat();
		}

		List<Rodent> l = new ArrayList(Arrays.asList(r));
		Iterator<Rodent> it = l.iterator();
		while (it.hasNext()) {
			Rodent rod = it.next();
			rod.eat();
		}

	}
}
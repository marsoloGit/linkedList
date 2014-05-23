package polymorphism;

public class Cycle {

	static void ride(Cycle c) {
		System.out.println("you are riding a cycle!");

	}

	void ride() {
		System.out.println("Default:you are riding a cycle!");
		weels();

	}

	int weels() {
		return 1;
	}

	void buy() {
		System.out.println("Default:you are buying a cycle!");

	}

	void balance() {
		System.out.println("Cycle balance");

	}

	public static void main(String[] args) {
		Unicycle u = new Unicycle();
		Bicycle b = new Bicycle();
		Tricycle t = new Tricycle();

		ride(u);
		ride(b);
		ride(t);
		u.ride();
		b.ride();
		b.buy();
		System.out.println(u.weels());
		System.out.println(b.weels());
		System.out.println(t.weels());

		Cycle[] c = { new Unicycle(), new Bicycle(), new Tricycle() };
		c[0].balance();
		c[1].balance();
		c[2].balance();
		((Unicycle) c[0]).balance();
		((Bicycle) c[1]).balance();
		((Tricycle) c[2]).balance();

	}

}

class Unicycle extends Cycle {
	void ride() {
		System.out.println("Unicycle:you are riding a Unicycle!");

	}

	void balance() {
		System.out.println("Unicycle balance");

	}

}

class Bicycle extends Cycle {
	int weels() {
		return 2;
	}

	void balance() {
		System.out.println("Bicycle balance");

	}

}

class Tricycle extends Cycle {
	int weels() {
		return 3;
	}

}
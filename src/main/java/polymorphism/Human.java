package polymorphism;

public class Human {

	void method1() {
		System.out.println("Human method 1");
		method2();
	}

	void method2() {
		System.out.println("Human method 2");
	}

}

class Baby extends Human {
	void method2() {
		System.out.println("Baby method 2");
	}

	public static void main(String[] args) {
		Human h = new Baby();
		h.method1();
	}
}

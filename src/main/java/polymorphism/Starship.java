package polymorphism;

import java.util.Random;

class AlertStatus {

	public void alert() {

	}

}

class Danger extends AlertStatus {
	public void alert() {
		System.out.println("Danger!!!");

	}

}

class Autopilot extends AlertStatus {
	public void alert() {
		System.out.println("Autopilot is currently in use");

	}
}

class Meteorites extends AlertStatus {
	public void alert() {
		System.out.println("Watch out!Meteorites!");

	}
}

public class Starship {
	private AlertStatus alertStatus = new Autopilot();

	public void change(int state) {
		switch (state) {
		default:
			alertStatus = new Autopilot();
			break;
		case 0:
			alertStatus = new Danger();
			break;
		case 1:
			alertStatus = new Meteorites();
			break;
		}

	}

	public void showState() {
		alertStatus.alert();
	}

	public static void main(String[] args) {

		Starship s = new Starship();
		s.change(9);
		s.showState();

	}

}

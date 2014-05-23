package polymorphism;

import java.util.Random;

class Instrument {
	void play(Note n) {
		System.out.println("Instrument.play() " + n);
	}

	String what() {
		return "Instrument";
	}

	void adjust() {
		System.out.println("Adjusting Instrument");
	}
}

class Wind extends Instrument {
	void play(Note n) {
		System.out.println("Wind.play() " + n);
	}

	String what() {
		return "Wind";
	}

	void adjust() {
		System.out.println("Adjusting Wind");
	}
}

class Percussion extends Instrument {
	void play(Note n) {
		System.out.println("Percussion.play() " + n);
	}

	String what() {
		return "Percussion";
	}

	void adjust() {
		System.out.println("Adjusting Percussion");
	}
}

class Stringed extends Instrument {

	void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}

	String what() {
		return "Stringed";
	}

	void adjust() {
		System.out.println("Adjusting Stringed");
	}
}

class Brass extends Wind {
	void play(Note n) {
		System.out.println("Brass.play() " + n);
	}

	void adjust() {
		System.out.println("Adjusting Brass");
	}

	String what() {
		return "Brass";
	}
}

class Woodwind extends Wind {
	void play(Note n) {
		System.out.println("Woodwind.play() " + n);
	}

	String what() {
		return "Woodwind";
	}
}

class Gitar extends Stringed {
	void play(Note n) {
		System.out.println("Gitar.play() " + n);
	}

	String what() {
		return "Gitar";
	}
}

class RandomInstrumentGenerator {
	private Random rand = new Random(47);

	public Instrument next() {
		switch (rand.nextInt(5)) {
		default:
		case 0:
			return new Wind();
		case 1:
			return new Percussion();
		case 2:
			return new Stringed();
		case 3:
			return new Brass();
		case 4:
			return new Gitar();
		case 5:
			return new Woodwind();
		}
	}
}

public class Music3 {
	private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();

	// Doesn�t care about type, so new types
	// added to the system still work right:
	public static void tune(Instrument i) {
		// ...
		i.play(Note.MIDDLE_C);
		// i.adjust();
	}

	public static void tuneAll(Instrument[] e) {
		for (Instrument i : e) {
			tune(i);
			System.out.println(i.what());

		}
	}

	public Instrument randomInstrumentGenerator() {
		Random rand = new Random(47);

		switch (rand.nextInt(30)) {
		default:
		case 0:
			return new Wind();
		case 1:
			return new Percussion();
		case 2:
			return new Stringed();
		case 3:
			return new Brass();
		case 4:
			return new Gitar();
		case 5:
			return new Woodwind();

		}

	}

	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instrument[] orchestra = { new Wind(), new Percussion(),
				new Stringed(), new Brass(), new Woodwind(), new Gitar() };
		// tuneAll(orchestra);
		// Music3 m = new Music3();

		Instrument[] concert = new Instrument[6];

		for (int i = 0; i < concert.length; i++) {
			concert[i] = gen.next();
		}
		// for(Instrument inst:concert){
		// System.out.println(inst.what());

		// }
		tuneAll(concert);

	}
}

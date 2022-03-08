package csi.perez.inheritance;

public class GoldenDoodle extends Dog {

	public GoldenDoodle() {
		super("Golden Doodle", "brown", 70, false, true, "goldendoodle.png");
	}

	@Override
	Noise bark() {
		Noise n = new Noise("Waaaaaaaughhh!", 1, true);
		System.out.println(n);
		return n;
	}

	public void wagtail() {
		System.out.println("woosh woosh");
	}

	public Shit eat() {

		return new Shit(50, "brown", "runny", "poop.png");
	}
}

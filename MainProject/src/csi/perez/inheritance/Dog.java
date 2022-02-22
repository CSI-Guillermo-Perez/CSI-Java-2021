package csi.perez.inheritance;

public class Dog {
	String breed;
	String hair;
	int size;
	Boolean wild = true;
	Boolean gender;
	ImageIcon icon;
	
	public Dog(String breed, String hair, int size, Boolean wild, Boolean gender,String imageDir) {
		super();
		this.breed = breed;
		this.hair = hair;
		this.size = size;
		this.wild = wild;
		this.gender = gender;
		this.icon = new ImageIcon(getClass().getResource(imageDir));

	}

	public void piss() {
		if (gender == true)
			;
		{
			System.out.println(" Raise leg, Tsssss");
		}
	}


	public Shit eat(Food f) {
		return null;
	}

	public void die() {

	}

	Noise bark() {
		return new Noise();
	}

	public void wagtail() {

	}
	public void mate(Dog D) {
		
	}
	
	public class Food {
		int healthy;
		int type;
		int texture;
		int color;

		public Food(int healthy, int type, int texture, int color) {
			super();
			this.healthy = healthy;
			this.type = type;
			this.texture = texture;
			this.color = color;
		}

	}
	private class Shit {
		int size;
		int color;
		int consistency;

		public Shit(int size, int color, int consistency) {
			super();
			this.size = size;
			this.color = color;
			this.consistency = consistency;
		}

	}

	public class Noise {
		String sound;
		int intention;
		Boolean loudness;
		
		public String toString() {
			return ("Waaaaaaaughhh!");
		}
		
	
		
		public Noise(String sound, int intention, Boolean loudness) {
			super();
			this.sound = sound;
			this.intention = intention;
			this.loudness = loudness;
		}



		public Noise() {}
	}
}

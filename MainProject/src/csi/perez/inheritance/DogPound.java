package csi.perez.inheritance;

public class DogPound extends JPanel{
	static Dog[] dogPound;
public static void main(String[] args) {
		
		dogPound = new Dog[10];
		dogPound[0] = new Dog("Pitbull", "Grey", 6, false, true, null);
}
}

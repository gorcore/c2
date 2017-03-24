package paketchen;

public class Haupt {
	public static void main (String[] args) {
		// Start der Ausgabe folgt
		System.out.println("Allerlei");
		Desk desk = new Desk();
		System.out.println(desk.getDescription());
		Random rng = new Random();
		System.out.println(rng.nextInt());
	} // main()
} // class

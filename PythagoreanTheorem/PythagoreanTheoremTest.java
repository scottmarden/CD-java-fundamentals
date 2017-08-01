public class PythagoreanTheoremTest {
	public static void main(String[] args) {
		PythagoreanTheorem pT = new PythagoreanTheorem();
		int a = 3;
		int b = 5;
		double hypot = pT.calculateHypotenuse(a, b);
		System.out.println("Hypotenuse of triangle with " + a + " and " + b + ": " + hypot);
	}
}

public class StringManipulationTest {
	public static void main(String[] args){
		StringManipulation manipulator = new StringManipulation();

		String str = manipulator.trimAndConcat(" Hello "," World ");
		System.out.println(str);

		System.out.println(manipulator.getIndexOrNull("Coding", 'o'));
		System.out.println(manipulator.getIndexOrNull("Hello World", 'o'));
		System.out.println(manipulator.getIndexOrNull("Hi", 'o'));

		System.out.println(manipulator.getIndexOrNull("Hello", "llo"));
		System.out.println(manipulator.getIndexOrNull("Hello", "world"));

		System.out.println(manipulator.concatSubstring("Hello", 1, 2, "world"));
	}
}

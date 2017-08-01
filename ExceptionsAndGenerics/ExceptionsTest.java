import java.util.*;

public class ExceptionsTest {
	public static void main(String[] args){

		Exceptions exception = new Exceptions();

		ArrayList<Object> myList = new ArrayList<>();
		myList.add("13");
		myList.add("hello world");
		myList.add(48);
		myList.add("Goodbye World");

		exception.castToInt(myList);
	}
}

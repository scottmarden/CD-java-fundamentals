import java.util.ArrayList;
import java.util.Arrays;
public class BasicJavaTest {
	public static void main(String[] args){
		BasicJava basic = new BasicJava();

		basic.printStartToEnd(1, 255);
		basic.printOddStartToEnd(1, 255);
		basic.printSum(0, 255);

		ArrayList<Object> anyArr = new ArrayList<Object>();
		anyArr.add(10);
		anyArr.add(20);
		anyArr.add("Hello");
		basic.iterateArray(anyArr);

		int[] myArr = {1, 3, 5, 7, 9, 13};
		int[] mySecondArr = {1, 5, 10, -2};
		int[] myNegArr = {-1,-3,-5,-7,-9,-13};

		basic.findMax(myArr);
		basic.findMax(myNegArr);
		basic.getAverage(myArr);
		basic.oddArray(1, 255);
		basic.greaterThan(myArr, 3);

		System.out.println("My Array: " + Arrays.toString(myArr));
		basic.squareArr(myArr);
		System.out.println("My Squared Array: " + Arrays.toString(myArr));
		basic.stayPositive(mySecondArr);
		System.out.println("My positive Array: " + Arrays.toString(mySecondArr));
		basic.maxMinAvg(mySecondArr);
		basic.shiftToFront(mySecondArr);



	}
}

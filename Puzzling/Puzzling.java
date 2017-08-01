import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
import java.lang.StringBuilder;

public class Puzzling{

	Random rand = new Random();

	// Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)

	public ArrayList<Integer> sumAndGreater(Integer[] arr){
		int sum = arr[0];
		ArrayList<Integer> greaterArr = new ArrayList<Integer>();
		for(int i = 1; i < arr.length; i++){
			sum += arr[i];
			if(arr[i] > 10){
				greaterArr.add(arr[i]);
			}
		}
		System.out.println("Sum of array: " + sum);
		System.out.println(greaterArr);
		return greaterArr;
	}

	// Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.

	public ArrayList<String> shuffleArray(String[] arr){
		int currentIndex = arr.length;
		String tempValue;
		int randomIndex;
		ArrayList<String> greaterArr = new ArrayList<String>();

		while(currentIndex != 0){
			randomIndex = rand.nextInt(arr.length);
			currentIndex -= 1;

			tempValue = arr[currentIndex];
			arr[currentIndex] = arr[randomIndex];
			arr[randomIndex] = tempValue;
		}

		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);

			if(arr[i].length() > 5){
				greaterArr.add(arr[i]);
			}

		}
		System.out.println(greaterArr);
		return greaterArr;
	}

	// Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and display the last letter of the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message

	public void shuffleABC(){
		char[] abc = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

		int currentIndex = abc.length;
		char tempValue;
		int randomIndex;

		while(currentIndex != 0){
			randomIndex = rand.nextInt(abc.length);
			currentIndex -= 1;

			tempValue = abc[currentIndex];
			abc[currentIndex] = abc[randomIndex];
			abc[randomIndex] = tempValue;
		}
		System.out.println("Last letter in array: " + abc[abc.length-1]);
		System.out.println("First letter in array: " + abc[0]);
		if(abc[0] == 'a' || abc[0] == 'e' || abc[0] == 'i' || abc[0] == 'o' || abc[0] == 'u' || abc[0] == 'y'){
			System.out.println("I'll take a vowel!");
		}

	}

	// Generate and return an array with 10 random numbers between 55-100.
	public ArrayList<Integer> randArr(){

		int randNum;
		ArrayList<Integer> randNums = new ArrayList<Integer>();
		while (randNums.size() < 10){
			randNum = (rand.nextInt(100-55)+1) + 55;
			randNums.add(randNum);
		}
		System.out.println(randNums);
		return randNums;
	}

	// Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
	public ArrayList<Integer> randArrMinMax(){
		int randNum;
		ArrayList<Integer> randNums = new ArrayList<Integer>();
		while (randNums.size() < 10){
			randNum = (rand.nextInt(100-55)+1) + 55;
			randNums.add(randNum);
		}
		Collections.sort(randNums);
		int min = randNums.get(0);
		int max = randNums.get(randNums.size()-1);
		System.out.println("Array of Random Numbers: " + randNums);
		System.out.println("Minimum value: " + min);
		System.out.println("Maximum value: " + max);
		return randNums;
	}

	// Create a random string that is 5 characters long.
	public String randString(){
		String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWZYZ";
		StringBuilder randString = new StringBuilder();
		while(randString.length() < 5){
			randString.append(candidateChars.charAt(rand.nextInt(candidateChars.length())));
		}
		return randString.toString();

	}

	// Generate an array with 10 random strings that are each 5 characters long
	public ArrayList<String> randStringArr(){
		String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWZYZ";
		StringBuilder sb = new StringBuilder();
		ArrayList<String> strArr = new ArrayList<String>();
		for(int i = 0; i < 10; i++){
			sb.setLength(0);
			while(sb.length() < 5){
				sb.append(candidateChars.charAt(rand.nextInt(candidateChars.length())));
			}
			strArr.add(sb.toString());
		}
		return strArr;
	}

}

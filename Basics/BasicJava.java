import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
	public void printStartToEnd(int start, int end){
		for(int i = start; i <= end; i++){
			System.out.println(i);
		}
	}
	public void printOddStartToEnd(int start, int end){
		for(int i = start; i <= end; i++){
			if(i % 2 != 0){
				System.out.println(i);
			}
		}
	}
	public void printSum(int start, int end){
		int num;
		int sum = 0;
		for(int i = start; i <= end; i++){
			num = i;
			sum += num;
			System.out.println("New number: " + num + " Sum: " + sum);
		}
	}
	public void iterateArray(ArrayList<Object> arr){
		for(Object item : arr){
			System.out.println(item);
		}
	}
	public Integer findMax(int[] arr){
		int max = arr[0];
		for(int i = 1; i<arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println(max);
		return max;
	}
	public Double getAverage(int[] arr){
		int sum = arr[0];
		for(int i = 1; i < arr.length; i++){
			sum += arr[i];
		}
		double avg = (sum / arr.length);
		System.out.println(avg);
		return avg;
	}
	public void oddArray(int start, int end){
		ArrayList<Integer> oddArr = new ArrayList<Integer>();
		for (int i = start; i <= end; i++){
			if(i % 2 != 0){
				oddArr.add(i);
			}
		}
		System.out.println(oddArr);
	}
	public Integer greaterThan(int[] arr, int check){
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > check){
				count++;
			}
		}
		System.out.println(count);
		return count;
	}
	public void squareArr(int[] arr){
		for(int i = 0; i < arr.length; i++){
			arr[i] = arr[i]*arr[i];
		}
	}
	public void stayPositive(int[] arr){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < 0){
				arr[i] = 0;
			}
		}
	}
	public int[] maxMinAvg(int[] arr){
		int max = arr[0];
		int min = arr[0];
		int sum = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
			if(arr[i] < min){
				min = arr[i];
			}
			sum += arr[i];
		}
		int avg = sum/arr.length;
		int[] results = {max, min, avg};
		System.out.println(Arrays.toString(results));
		return results;
	}
	public int[] shiftToFront(int[] arr){
		for(int i = 0; i < arr.length; i++){
			if(i == arr.length - 1){
				arr[i] = 0;
			}
			else{
				arr[i] = arr[i+1];
			}
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}


}

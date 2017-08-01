import java.util.ArrayList;
import java.util.Arrays;

public class PuzzlingTest {
	public static void main(String[] args){
		Puzzling puzzle = new Puzzling();

		Integer[] myArr = {3,5,1,2,7,9,8,13,25,32};
		puzzle.sumAndGreater(myArr);

		String[] myStrArr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
		puzzle.shuffleArray(myStrArr);

		puzzle.shuffleABC();

		puzzle.randArr();

		puzzle.randArrMinMax();

		System.out.println(puzzle.randString());
		System.out.println(puzzle.randStringArr());
	}
}

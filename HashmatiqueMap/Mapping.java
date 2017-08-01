import java.util.HashMap;
import java.util.ArrayList;
public class Mapping {

	public void printTrack(HashMap<String, String> map, String trackName){
		String lyrics = map.get(trackName);
		String printOut = trackName + ": " + lyrics;
		System.out.println(printOut);
	}




}

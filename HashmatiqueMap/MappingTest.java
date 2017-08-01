import java.util.HashMap;

public class MappingTest {
	public static void main(String[] args){
		Mapping mapping = new Mapping();

		HashMap<String, String> songMap = new HashMap<>();
		songMap.put("Lazy Eye", "I've been waiting for this moment...");
		songMap.put("Panic Switch", "WWhen you see yourself in a crowded room...");
		songMap.put("Rusted Wheel", "I've got a lump in my throat...");
		songMap.put("Latchkey Kids", "So unlock the door, it’ll make you feel better.");

		mapping.printTrack(songMap, "Panic Switch");
		mapping.printTrack(songMap, "Lazy Eye");
		mapping.printTrack(songMap, "Latchkey Kids");
		mapping.printTrack(songMap, "Rusted Wheel");
	}
}

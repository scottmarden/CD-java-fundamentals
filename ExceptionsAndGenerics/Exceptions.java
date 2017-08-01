import java.util.*;

public class Exceptions {
	public void castToInt(ArrayList<Object> list) {
		for(int i = 0; i<list.size(); i++){
			try {
				Integer intVar = (Integer) list.get(i);
				System.out.println(intVar);
			} catch(ClassCastException e){
				System.out.println("Class Cast Exception on line " + i);
			}

		}
	}
}

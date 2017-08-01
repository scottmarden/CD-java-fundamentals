public class StringManipulation {
	public  String trimAndConcat(String str1, String str2){
		String newStr;
		//Trim both input strings and then concatenate them. Return the new string.
		newStr = str1.trim().concat(str2.trim());
		return newStr;
	}
	public Integer getIndexOrNull(String str, char item){
		//Get the index of the character and return either the index or null. If the character appears multiple times, return the first index.
		int index = str.indexOf(item);
		if (index == -1){
			return null;
		}
		else{
			return index;
		}

	}
	public Integer getIndexOrNull(String str, String subStr){
		//Get the index of the start of the substring and return either the index or null.
		int index = str.indexOf(subStr);
		if(index == -1){
			return null;
		}
		else{
			return index;
		}
	}
	public String concatSubstring(String str, int start, int end, String str2){
		//Get a substring using a starting and ending index, and concatenate that with the second string input to our method.
		String subStr = str.substring(start, end);
		String newStr = subStr.concat(str2);
		return newStr;
	}
}

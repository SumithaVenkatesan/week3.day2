package week3.day2;

import java.util.HashSet;

public class PrintOnlyUniqueCharacters {

	public static void main(String[] args) {
		String input = "babu";
		char[] charArray = input.toCharArray();
		HashSet<Character> charHashSet = new HashSet<Character>();
		for(Character charVal:charArray) {	
			if(charHashSet.contains(charVal)) {
				charHashSet.remove(charVal);
			}else {
				charHashSet.add(charVal);
			}
			
		}
		System.out.println("Unique Value: "+charHashSet);
		

	}

}

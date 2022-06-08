package week3.day2;

import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		Integer[] numbers = {4,6,7,2,3,1,9,10,8,8,6,2,12,14};
		/*
		 * Psuedocode
		 * 
		 * 1) Remove the duplicates using Set
		 * 2) Make sure the set is in the ascending order
		 * 3) Iterate from the starting number and verify the next number is + 1
		 * 4) If did not match, that is the number
		 * 
		 */
		
		TreeSet<Integer> integerTree = new TreeSet<Integer>();
		for(Integer nuVal:numbers) {
			integerTree.add(nuVal);			
		}
		System.out.println("Sorted Array: "+integerTree);
		Integer missIncVal=1;
		TreeSet<Integer> missingIntegerTree = new TreeSet<Integer>();
		for(Integer missingVal:integerTree) {
			
			if(missIncVal!=missingVal) {
				missingIntegerTree.add(missIncVal);
			}
			missIncVal=missingVal+1;
		}
		System.out.println("Missing Value is : "+missingIntegerTree);
	}

}

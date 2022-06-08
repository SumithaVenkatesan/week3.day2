package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {

		// Here is the input
		Integer[] data = {3,2,11,4,6,7};
		
		
		
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		
		List<Integer> lisValue = new ArrayList(Arrays.asList(data));
		
		
		Collections.sort(lisValue);
		System.out.println("2nd element from last Value : "+lisValue.get(lisValue.size()-2));
		
		
	}

}

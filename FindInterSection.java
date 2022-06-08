package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindInterSection {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		
		Integer[] firstArray = {3,2,11,4,6,7};
		Integer[] secondArray = {1,2,8,4,9,7};
		List<Integer> firstList = new ArrayList<Integer>(Arrays.asList(firstArray));
		List<Integer> secondList = new ArrayList<Integer>(Arrays.asList(secondArray));
		
		
		for(int i=0;i<firstList.size();i++) {
			for(int j=0;j<secondList.size();j++) {
				if(firstList.get(i)==secondList.get(j)) {
					System.out.println("firstArray value :"+firstList.get(i)+" :secondArray : "+secondList.get(j));
				}
				
			}

		}

	}

}

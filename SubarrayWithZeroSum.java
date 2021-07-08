/*
 * Given an array, 
 * find the existing sub array with { sum = 0 & sum = k }
 * 
 * n < 10^5
 */

package listInterface;

import java.util.HashSet;
import java.util.Set;

public class SubarrayWithZeroSum {

	public static void main(String[] args) {
		
		int[] a = {2, 1, 3, -4, -2};
		boolean found = false;
		
		Set<Integer> set = new HashSet<>();
		
		int sum = 0;
		
		// part - 1 { sum = 0 }
		
		for(int element: a) {
			set.add(sum);
			sum += element;
			if(set.contains(sum)) {
				found = true;
				break;
			}
		}
		
		// part - 2 { sum = k }
		
		int k = 6;
		for(int element: a) {
			set.add(sum);
			sum += element;
			if(set.contains(sum - k)) {
				found = true;
				break;
			}
		}
		
		System.out.println("found = " + found);
		
	}

}

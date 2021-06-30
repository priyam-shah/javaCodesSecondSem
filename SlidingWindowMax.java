
  Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
	Output: [3,3,5,5,6,7]
	Explanation: 
	Window position                Max
	---------------               -----
	[1  3  -1] -3  5  3  6  7      3
 	1 [3  -1  -3] 5  3  6  7       3
 	1  3 [-1  -3  5] 3  6  7       5
 	1  3  -1 [-3  5  3] 6  7       5
 	1  3  -1  -3 [5  3  6] 7       6
 	1  3  -1  -3  5 [3  6  7]      7

package listInterface;

import java.util.*;

public class SlidingWindowMax {
	public static void main(String[] args) {
		
		Solution sl = new Solution();
		
		int arr[] = {4, 3, 1, 2, 5, 3, 4, 7, 1, 9};
//		int arr[] = {1,3,-1,-3,5,3,6,7};
		
		int k = 4;
//		int k = 3;
		
		int ans[] = sl.maxSlidingWindow(arr, k);
		
		for (int x: ans) {
			System.out.print(x + " ");
		}
		
	}
	
	static class Solution {
	    public int[] maxSlidingWindow(int[] arr, int k) {
	        
	    	int n = arr.length;
	    	
	    	if (n < 1) {
	    		return arr;
	    	}
	    	
	    	Deque<Integer> dq = new LinkedList<>();
	    	int ans[] = new int[n-k+1];
	    	
	    	// filling dq with first k elements
	    	int i = 0;
	    	for (; i < k; i++) {
	    		while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
	    			dq.removeLast();
	    		}
	    		dq.addLast(i);
	    	}
	    	
	    	// next loop for other elements
	    	for (; i < n; i++) {
	    		ans[i-k] = arr[dq.peekFirst()];
	    		
	    		while (!dq.isEmpty() && dq.peekFirst() <= i-k) {
	    			dq.removeFirst();
	    		}
	    		
	    		while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
	    			dq.removeLast();
	    		}
	    		dq.addLast(i);
	    	}
	    	
	    	ans[i-k] = arr[dq.peekFirst()];
	    	return ans;
	    }
	}
}

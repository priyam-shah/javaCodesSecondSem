/*
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * Output: 
 * [
 * 	["ate", "eat", "tea"],
 *  ["nat", "tan"],
 *  ["bat"]
 * ]
 */

package listInterface;

import java.util.*;

public class GroupAnagrams {

	public static void main(String[] args) {
		
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
//		String[] strs = {"a"};
				
		System.out.println(groupAnagrams(strs)); 
		
	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
		
		Map<String, List<String>> map = new HashMap<>();
		
		for(String s: strs) {
			char charArray[] = s.toCharArray();
			Arrays.sort(charArray);
			
			// comparator to convert char array to string
			String sorted = new String(charArray);
			
			if(!map.containsKey(sorted)) {
				map.put(sorted, new LinkedList<String>());
			}
			map.get(sorted).add(s);
	
		}
		
		return new LinkedList<>(map.values());
	}
}

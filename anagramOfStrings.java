// method 1 ------------- O9n^2) ---------easy--------less-effective


package arrays;
public class AnagramOfString {

	public static void main(String[] args) {
		
		
		String a ="aab";
		String b ="abc";
		
		boolean visited[] = new boolean[b.length()];  //boolean to mark a character when it is checked 
		boolean isAnagram = false ;
		
		if(a.length()==b.length()) {                // basic check
			for(int i=0; i< a.length() ;i++) {
				
				char c =a.charAt(i);
				isAnagram = false ;
				
				for(int j=0; j<b.length();j++ ) {
					
					if(b.charAt(j)==c && !visited[j]) {   // compare every character of b with a 
						visited[j]= true ;                  // if found mark true in visited
						isAnagram = true ;
						break;
					}
				}
				if(!isAnagram) {
					break;
				}
			}
		
		}
		
		if(isAnagram) {
			System.out.println("anagram");
		}
		
		else {
			System.out.println("not anagram");
		}
	}

}


// method 2 ------------- using two arrays
// in one array lets say a, iterate it and find ASCII values of the corresponding 
// characters  .. with that values mark number of appearances of that character eg if A appears twice a[65]=2... 
// and finally compare two arrays 

package arrays;

public class Anagram2 {
	public static void main(String[] args) {
		
		boolean isAnagram = true ;
		String a ="listen";
		String b ="silent";
		
		int al[] = new int[256];
		int bl[] = new int[256];
		
		for(char c: a.toCharArray()) {
			int index= (int)c;
			al[index]++;
		}
		
		for(char c: b.toCharArray()) {
			int index= (int)c;
			bl[index]++;
		}
		
		 for(int i=0;i<256;i++) {
			if(al[i] != bl[i]) {
				isAnagram =false;
				break;
			}
		 }
		
		if(isAnagram) {
			System.out.println("anagram");
		}
		
		else {
			System.out.println("not anagram");
		}
		
	}
}


// method-3 ------optimized version of the second method 
// instead of incrementing both arrays when a character was found, this time we only have an array so we will increment
// that array al for one string, and decrement for another array ... and finally, check if these array is having 0 or not 

// using only one array

package arrays;

public class Anagram3 {
	public static void main(String[] args) {
		
		boolean isAnagram = true ;
		String a ="listen";
		String b ="silent";
		
		int al[] = new int[256];
		
		for(char c: a.toCharArray()) {
			int index= (int)c;
			al[index]++;
		}
		
		for(char c: b.toCharArray()) {
			int index= (int)c;
			al[index]--;
		}
		
		 for(int i=0;i<256;i++) {
			if(al[i] !=0) {
				isAnagram =false;
				break;
			}
		 }
		
		if(isAnagram) {
			System.out.println("anagram");
		}
		
		else {
			System.out.println("not anagram");
		}
		
	}
}



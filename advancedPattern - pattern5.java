package pkge;
import java.util.Scanner;
public class AdvancedPatternCont {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		int patternNumber = 1;
		
		for(int i=1 ; i<= (n/2)+1; i++){				
			
			if(i == 1) {
				for(int j=1; j<= n ; j++ ){
					if(j ==1) {
						System.out.print(patternNumber + " ");
						patternNumber++;
					}
					else if(j<= n/2) {
						System.out.print("  ");
						}
					else {
						System.out.print("* ");
						}
					}
					System.out.println();
				}
			
			else if(i == (n/2)+1 ) {
				for(int j=1;j<=n ; j ++){
					if(j == n/2+1) {
						System.out.print("* ");
						patternNumber ++;
					} else {
						System.out.print(patternNumber + " ");
						patternNumber++;
					}
				}
				System.out.println();
			}
			else {
				
				for(int j=1; j<= n ; j++ ){
					if(j ==1) {
						System.out.print(patternNumber + " ");
						patternNumber++;
					}
					else if(j<= n/2) {
						System.out.print("  ");
						}
					else if(j<= (n/2)+1 ) {
						System.out.print("* ");
						}
					}
				System.out.println();
				}
		}
		
		for(int i= (n/2)+2 ; i<=n ; i++) { 
			for(int j=1; j<= n-1 ; j++) {
				System.out.print("  ");
			}
			
			System.out.println(patternNumber);
			patternNumber++;
		}
		
	}

}


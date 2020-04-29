***** pattern *****

5

1   A B C 
2   D 
3 4 * 6 7 
    F   8 
G H I   9



package pkge;
import java.util.Scanner;
public class AdvancedPattern {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		int patternNumber = 1;
		int patternAlpha = 65;
		
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
						System.out.print((char)patternAlpha +" ");
						patternAlpha++;
						}
					}
					System.out.println();
				}
			
			else if(i == (n/2)+1 ) {
				for(int j=1;j<=n ; j ++){
					if(j == n/2+1) {
						System.out.print("* ");
						patternNumber ++;
						patternAlpha ++;
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
						System.out.print( (char)patternAlpha +" ");
						patternAlpha++;
						}
					}
				System.out.println();
				}
		}
		
		for(int i= (n/2)+2 ; i<=n ; i++) { 
			
			if(i == n) {
				for(int j=1; j<= n ; j++ ){
					
					if(j ==n) {
						System.out.print(patternNumber + " ");
						patternNumber++;
					}
					else if(j<= (n/2)+1) {
						System.out.print( (char)patternAlpha + " ");
						patternAlpha++;
						}
					else {
						System.out.print("  ");
						}
					}
				}
			else{
				
				for(int j=1; j<= n ; j++ ){
					if(j ==n) {
						System.out.print(patternNumber + " ");
						patternNumber++;
					}
					
					else if(j== (n/2)+1 ) {
						System.out.print((char)patternAlpha+" ");
						patternAlpha++;
						}
					else {
						System.out.print("  ");
						}
					}
				System.out.println();
			}
			
			
		}
		
	}

}

package pkge2;
import java.util.Scanner ;
public class SumOfDigits {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
   // ******************** by while loop ********************
    int temp = n ;
		int sum=0 ;
		while(temp>0) {
			int lastDigit = temp%10 ;
			temp /= 10 ;
			sum += lastDigit ;
			}
		System.out.println("sum of digits of " + n + " = " + sum);
		
    // ******************** by for loop ******************** 
    
		int fortemp = n ;
		int forsum = 0 ; 
		int NoOfDigits = (int)Math.log10(n) + 1 ;
		for(int i =1 ; i<= NoOfDigits ; i++ ,  fortemp /= 10) {
			int forlastDigit = fortemp%10 ;		
			forsum += forlastDigit ;
		}
		System.out.println("sum of digits of " + n + " = " + forsum);
	}

}

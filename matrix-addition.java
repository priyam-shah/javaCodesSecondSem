package arrays;
import java.util.Scanner ;
public class Arr1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter rows ");
		int rows = sc.nextInt();
		
		System.out.println("enter colums ");
		int col = sc.nextInt();
		
		
		int a[][] = new int[rows][col];
		
		int b[][] = new int[rows][col];
		
		int c[][] = new int [rows][col]  ;
		
		System.out.println("enter 1st array ");
		
		for(int i=0 ; i<rows ; i++)
		{
			for(int j=0 ; j<col ; j++)
			{
				a[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("enter 2nd array ");
		for(int i=0 ; i<rows ; i++)
		{
			for(int j=0 ; j<col ; j++)
			{
				b[i][j]= sc.nextInt();
			}
		}
		
		
		for(int i=0 ; i<rows ; i++)
		{
			for(int j=0 ; j<col ; j++)
			{
				c[i][j] = a[i][j] + b[i][j] ;
			}
		}
		
		System.out.println("added array ");
		
		for(int i=0 ; i<rows ; i++)
		{
			for(int j=0 ; j<col ; j++)
			{
				System.out.println(c[i][j]);
			}
			 
		}
			
	}
}

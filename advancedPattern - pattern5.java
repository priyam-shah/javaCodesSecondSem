ONE OF THE BEST PATTERN I CREATED

***** pattern *****

Enter the size:
5
	
	
1   C B A 
2   D 
3 4 * 6 7 
    F   8
I H G   9

	
package pkge;
import java.util.*;
public class AdvancedPattern 
{
    @SuppressWarnings("resource")
    public static void main(String[] args) 
    {
        int patternNumber = 1, pa1, pa2, pa3, pa4, n;
        boolean b1=true, b2=true ;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size:");
        n = sc.nextInt();
        
        pa1=65+((n-1)/2); // for n=5 pa1=67=C
        pa2=65+n+(n-2); // for n=5 paa2=73=I
        pa3=pa1+1; // for n=5 pa3=68=D
        
        for(int i=1 ; i<= (n/2)+1; i++){
            if(i == 1){
                for(int j=1; j<= n ; j++ ){
                    if(j ==1){
                        System.out.print(patternNumber + " ");
                        patternNumber++;
                    }
                    else if(j<= n/2){ 
                        System.out.print("  ");
                    }    
                    else{ 
                    
                        System.out.print((char)pa1 +" ");
                        pa1--;
                    }
                }
                System.out.println();
            }
            else if(i == (n/2)+1 ) 
            {
                for(int j=1;j<=n ; j ++)
                {
                    if(j == n/2+1) 
                        System.out.print("* ");                    
                    else 
                        System.out.print(patternNumber + " ");
                    patternNumber++;
                }
                System.out.println();
            }
            else 
            {
                for(int j=1; j<= n ; j++ )
                {
                    if(j ==1) 
                    {
                        System.out.print(patternNumber + " ");
                        patternNumber++;
                    }
                    else if(j<= n/2) 
                        System.out.print("  ");
                    else if(j<= (n/2)+1 ) 
                    {
                        System.out.print((char)pa3 +" ");      
                        pa3++;
                    }
                }
                System.out.println();
            }
        }
        pa4 = pa3+1; //for n=5 pa4=68=D
        for(int i= (n/2)+2 ; i<=n ; i++) 
        {
            if(i == n) 
            {
                b1 = true; b2 = true;
                for(int j=1; j<= n ; j++ )
                {
                    if(j ==n) 
                    {
                        if(b1 && patternNumber>20)
                        {
                            System.out.print("     ");
                            b2=false;
                        }
                        else if(b2 && patternNumber>13)
                        {    
                            System.out.print("   ");
                            b1=false;
                        }
                        System.out.print(patternNumber);
                        patternNumber++;
                    }
                    else if(j<= (n/2)+1) 
                    {
                        System.out.print((char)pa2+" ");
                        pa2--;
                    }
                    else 
                        System.out.print("  ");
                }
            }
            else
            {
               
                for(int j=1; j<= n ; j++ )
                {
                    if(j ==n) 
                    {
                        if(b1 && patternNumber>16)
                        {
                            System.out.print("     ");
                            b2=false;
                        }
                        else if(b2 && patternNumber>13)
                        {    
                            System.out.print("   ");
                            b1=false;
                        }
                        System.out.print(patternNumber);
                        patternNumber++;
                    }
                    else if(j== (n/2)+1 ) 
                    {
                        System.out.print((char)pa4+" ");
                        pa4++;
                    }
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
}


*****console screen*****
Enter the string:
welcometojava
Enter the integer
4
All the permutations of string are:
1-> welc
2-> elco
3-> lcom
4-> come
5-> omet
6-> meto
7-> etoj
8-> toja
9-> ojav
10-> java
String having minimum priority is: come
String having maximum priority is: welc



package arrays;
import java.util.Scanner ;

class engine
{
    private String str, temp, temp2, max, min;
    private int n;
    private final String arr[][];
    engine(String str, int n)
    {
        this.str = str;
        this.n = n;
        arr = new String[str.length()][n];
    }
    void getvalue()
    {
        System.out.println("All the permutations of string are:");
        for(int i=0; i<(str.length()-(n-1)); i++)
        {
            temp = str.substring(i,n+i);
            arr[i][0] = temp;
            System.out.println((i+1)+"-> "+arr[i][0]);
        }
    }
    void getmax()
    {
        max = arr[0][0];
        for(int i=1; i<str.length()-(n-1); i++)
        {
            temp2 = arr[i][0];
            if(temp2.compareTo(max)>0)
                max = temp2;
        }
        System.out.println("String having maximum priority is: "+max);
    }
    void getmin()
    {
        min = arr[0][0];
        for(int i=1; i<str.length()-(n-1); i++)
        {
            temp2 = arr[i][0];
            if(temp2.compareTo(min)<0)
                min = temp2;
        }
        System.out.println("String having minimum priority is: "+min);
    }
}

public class SmallestHighestSubStrr {

	public static void main(String[] args) {
		
		String str;
	    int n; 
	    Scanner sc = new Scanner(System.in);
	    try
	    {
	        System.out.println("Enter the string:");
	        str = sc.nextLine();
	        str = str.toLowerCase();
	        str = str.replaceAll("\\s", "");
	        System.out.println("Enter the integer");
	        n = sc.nextInt();
	        if(n > str.length())
	            throw new Exception("your entered integer value is greater than length of string");
	        sc.close();
	        engine e1 = new engine(str, n);
	        e1.getvalue();
	        e1.getmin();
	        e1.getmax();
	    }
	    catch(Exception e)
	    {
	        System.out.println(e.getMessage());
	    }
	    finally
	    {
	        sc.close();
	    }
		

	}

}



import java.util.Scanner;
import java.util.Scanner;
public class Assignment4Q4 {

	public static void main(String []args) {
		// TODO Auto-generated method stub
		int i;
		Scanner h = new Scanner(System.in);
        int n = h.nextInt();
        int []a= new int[n];
        for(i=0;i<n;i++)
        {
      	  a[i]=h.nextInt();
        }
        System.out.print("Arrya : ");
        for(i=0;i<n;i++)
        {
      	 System.out.print(" "+a[i]);
        }
        h.close();
        for(i=0;i<n;i++)
        {
        	if(a[i]<a[i+1])
            System.out.println("\nAscending");
        		
        	else if(a[i]>a[i+1])
            	 System.out.println("\nDescending");	
             
             else
            	 System.out.println("\nRamdom");
             break;
        }
       

	}

}

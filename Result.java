import java.util.Scanner;
class Result
{


public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter value of x");
int x =sc.nextInt();
  
   int y =(x*x)+(3*x)-7;
   System.out.println("y="+y);
   
  
   y=x++ + ++x;
   System.out.println("x="+x+"y="+y);
   
  
   int z =x++ - --y - --x + x++;
   System.out.println("x="+x+"y="+y+"z="+z);
   
   

}
}




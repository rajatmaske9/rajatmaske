import java.util.Scanner;
class ArrayReverse
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter no of  elments");
int n =sc.nextInt(); //5
int a[] =new int[n];

System.out.println("Enter elments");
for(int i=0;i<n;i++)
{a[i]=sc.nextInt();}    // input =1 2 3 4 5
System.out.println("Before reverse");

for(int i=0;i<n;i++)
{System.out.print(a[i]+" ");}  //1 2 3 4 5 

System.out.println("\n"); // next line

System.out.println("After Reverse");
for(int i=a.length-1;i>=0;i--)   // i =4 3 2 1 0      

{System.out.print(a[i]+" ");}     // 5 4 3 2 1          
}
}



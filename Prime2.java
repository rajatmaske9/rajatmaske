import java.util.Scanner;
class Prime2
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter range");
int a=sc.nextInt();
int b=sc.nextInt();
for(i=a;i<=b;i++)
{
  if(i%2==1)
   {
      System.out.println(i);
   }
}
}
}
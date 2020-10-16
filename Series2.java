import java.util.Scanner;
class Series2
{
public static void main(String args[])
{
int a;

Scanner s =new Scanner(System.in);
System.out.println("Enter number");
int n =s.nextInt();

for(int i=0;i<=n;i++)
{
a=12+10*i;
System.out.print("a= "+a);
}
}
}
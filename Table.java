import java.util.Scanner;
class Table
{
public static void main(String args[])
{
Scanner s =new Scanner(System.in);
System.out.println("Enter a number");
int n =s.nextInt();
for(int i=1;i<=10;i++)
System.out.println(i*n);
}
}
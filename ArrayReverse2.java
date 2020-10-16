import java.util.Scanner;
class ArrayReverse2
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a[]=new int[n];
int b[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
System.out.print(a[i]);
}
for(int j=a.lenght-1;j<n;j--)
{
b[j]=sc.nextInt();
System.out.print(a[j]);
}
}
}
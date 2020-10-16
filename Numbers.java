import java.util.Scanner;
class Numbers
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter 3 numbers:");
int a =sc.nextInt();
int c =sc.nextInt();
int b =sc.nextInt();
if(a>b&&a>c)
System.out.println("a is largest"+a);
elseif(b>a&&b>c)
System.out.println("b is largest"+b);
else
System.out.println("c is largest"+c);
}
}

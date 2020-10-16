import java.util.Scanner;
class Swap
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter two numbers");
int x =sc.nextInt(); //10
int y  =sc.nextInt();  //20
x=x+y; //30
y=x-y;  //10
x=x-y; //20
System.out.println("x="+x+"y="+y);
}
}
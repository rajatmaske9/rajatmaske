import java.util.Scanner;
class Employee
{
public static void main(String args[])
{
int HRA,DA,GS;
Scanner sc = new Scanner(System.in);
System.out.println("Enter your basic salary");
int N= sc.nextInt();
if(N<10000)
{
 HRA=0.1*N;
 DA=*N;
GS=N+HRA+DA;
System.out.println("Gross salery="+GS);
}
if(N>=10000)
{
HRA=2000;
DA=0.98*N;
GS=N+HRA+DA;
System.out.println("Gross salery="+GS);
}
}
}

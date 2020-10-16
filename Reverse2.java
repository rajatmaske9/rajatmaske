import java.util.Scanner;
class Reverse2
{
public static void main(String args[])
{
int reversed=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int n =sc.nextInt(); 
while(n!=0)
{
int digit =n%10; 
reversed=(reversed*10)+digit; 
n/=10;
}    
System.out.println("Reversed="+reversed);

}
}
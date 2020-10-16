import java.util.Scanner;
public class Gender {
    public static void main(String args[])
{ 
Scanner sc = new Scanner(System.in);
System.out.println("Enter Gender");
System.out.println("Male:M  Female:F");
char a = sc.next().charAt(0);
System.out.println("Enter age");
int b =sc.nextInt();
if((a=='M'&&b>21)||(a=='F'&&b>18))
{
System.out.println("You are eligible");
}
else
{
System.out.println("You are not eligible");
}
}
}

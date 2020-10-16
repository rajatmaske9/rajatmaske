import java.util.Scanner;
class ArraySearch
{
public static void main(String args[])
{
int flag;
Scanner sc = new Scanner(System.in)
System.out.println("Enter array elments");
int []a =new int[10];

for(int i=0;i<10;i++)
{ a[i]=sc.nextInt();
System.out.print(a[i]);}

System.out.println("pick an elment from array");
int n=sc.nextInt();

for(int i=0;i<10;i++){
          if(a[i]==n){
           flag= 1;
            break;
             }
          else{
          flag= 0;
            }
if(flag==1){

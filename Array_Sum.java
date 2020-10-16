import java.util.Scanner;
class Array_Sum
{
public static void main(String args[]){
int sum=0;
 Scanner sc =new Scanner(System.in);
 System.out.println("Enter elements of array");
 int n = sc.nextInt();
 int a[]= new int[n];
 for(int i=0;i<n;i++){
 a[i]=sc.nextInt();
 sum=sum+a[i];
}
 System.out.println("sum="+sum);
 }
 }
public class Assignment4Q6 {

	 int data(int a[],x)
	{
		 int temp;
		 int i,j;
		 for(i=0;i<t1;i++)
		 {
			 for(j=i+1;j<t1;j++)
			 {
				 if(a[i]>a[j])
				 {
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
		 }
		 return a[t1-3];
	}
	public static void main(String[] args) {
		
		int a[]= {24,34,31,61,82,45,61};
		int t1=a.length;
		int k=getdata(a[],t1);
		System.out.println(k);
		// TODO Auto-generated method stub
          
	}
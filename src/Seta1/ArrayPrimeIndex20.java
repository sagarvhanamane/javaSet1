package Seta1;

public class ArrayPrimeIndex20 {

	public static void main(String[] args) {
		int a[]={1,23,3,37,5,6,20,8,9,10,11,12,13,14};
		int sum=0;
        boolean prime=true;
       for(int i=2;i<a.length;i++)
        {
	       for(int j=2;j<=i/2;j++)
	        {
		if(i%j==0)
		{
			prime=false;
			break;
		}
		
	}
	if(prime)
	{
		System.out.print(a[i]+" ");
		sum+=a[i];
	}
	prime=true;
}
System.out.println("\nSum of prime indexed number from array is "+sum);

	}

}

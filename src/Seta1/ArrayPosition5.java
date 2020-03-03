package Seta1;

public class ArrayPosition5 {

	public static void main(String[] args) {
		int a[]={12,1,32,3};
		int b[]={0,12,2,23};
		int ab[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			if(i%2==1 || i==1)
				ab[i]=a[i];
			else
				ab[i]=b[i];
		}
		System.out.print("array a+b=[");
		for(int i=0;i<ab.length;i++)
			System.out.print(ab[i]+ " ");
		System.out.print("]");
	
	}

}

package Seta1;

public class Squareandcube24 {

	public static void main(String[] args) {
		int [] a={1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++){
			if(i%2==0)
				sum+=a[i]*a[i];
			else
				sum+=Math.pow(a[i], 3);
			System.out.println(sum+" ");

			}

		System.out.println("Total: "+sum);
	}

}

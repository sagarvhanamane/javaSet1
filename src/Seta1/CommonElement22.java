package Seta1;

public class CommonElement22 {

	public static void main(String[] args) {
		int a[]={1,2,3,4};
		int b[]={3,4,5,6};
		int count =0;
		System.out.printf("\n common elements between two array are \n");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					if(count>0)
						System.out.print(",");
					System.out.print(a[i]);
					count++;
				}
			}
		}
		System.out.printf("\nTotal %d elements are common between two arrays",count);

	}

}

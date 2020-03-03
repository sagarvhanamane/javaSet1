package Seta1;

public class MergecommonElement4 {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5,7,9};
		int b[]={3,4,5,6,9};
		System.out.printf("common elements between two array are\n");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j])
					
					System.out.println(a[i]);
				}
			}
		
		}
}



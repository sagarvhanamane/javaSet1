package Seta1;

public class MaxDiffArray3 {

	public static void main(String[] args) {
		int array[]={2,3,4,2,3};
		int maxIndex=0, maxDiff=0, maxEle=0;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(maxDiff<Math.abs(array[i]-array[j])){
					maxDiff=Math.abs(array[i]-array[j]);
					if(array[i]>array[j])
					{
						maxEle=array[i];
						maxIndex=i;
					}
					else{
						maxEle=array[j];
						maxIndex=j;
					}
				}
				
			}
		}
		System.out.println("Maximum difference between element of array is "+maxDiff);
		System.out.println("Index of largest element "+maxEle +" in array is "+(maxIndex+1));

		
	}

}

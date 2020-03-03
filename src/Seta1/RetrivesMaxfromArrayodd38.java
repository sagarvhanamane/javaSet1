package Seta1;

import java.util.Arrays;
import java.util.Scanner;

public class RetrivesMaxfromArrayodd38 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements in array");
		int noofints=sc.nextInt();
		int [] intArray=new int [noofints];
		int index;
		int max;
		System.out.println("Enter no of element form array");
		for(int i=0; i<noofints; i++){
			intArray[i]=sc.nextInt();
			}
		Arrays.sort(intArray);
		if(noofints%2!=0){
			index=noofints;
		}else{
			index=noofints-1;
			
		}
		System.out.println("Max at odd index is "+intArray[index-1]+ " and index is "+index);
		

	}

}

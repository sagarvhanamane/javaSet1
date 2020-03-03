package Seta1;

import java.util.Scanner;

public class FindMaxnoarrayReveSum46 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter how many numbers in array");
		int noofint=sc.nextInt();
		int[] intArray=new int [noofint];
		System.out.println("Enter elements in the array");
		for(int i=0; i<noofint;i++){
		intArray[i]=sc.nextInt();
		}
		System.out.println("Enter no for compare");
		int compno=sc.nextInt();
		int sum=0;
		for(int no:intArray){
			if(no>compno){
				sum+=no;
			}
			
		}
		StringBuffer sbReverse= new StringBuffer(String.valueOf(sum));
		System.out.println(sum +" is sum of no and \n"+sbReverse.reverse()+" is reverse");
	}

}

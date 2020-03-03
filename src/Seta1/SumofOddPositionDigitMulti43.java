package Seta1;

import java.util.Arrays;
import java.util.Scanner;

public class SumofOddPositionDigitMulti43 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements in array");
		int noofints=sc.nextInt();
		int [] intArray=new int [noofints];
	
		System.out.println("Enter no of element form array");
		for(int i=0; i<noofints; i++){
			intArray[i]=sc.nextInt();
			}
		int sum=0,multi=0;
		for(int i=0;i<noofints;i++){
		if(i%2!=0){
			multi=i*intArray[i];
			sum+=multi;
		}
		}
		System.out.println("sum:"+sum);

	}

}

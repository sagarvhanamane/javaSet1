package Seta1;

import java.util.Scanner;

public class SumofOddDigit1 {

	public static void main(String[] args) {
		int number=0,sum=0;
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		while(number>0)
		{
			sum+=number%10;
			number/=10;
		}
		if(sum%2==0){
			System.out.println("Sum of odd digit of number is even:-1");
		}
		else{
			System.out.println("Sum of odd digit of number is odd:1");
		}

	}

}

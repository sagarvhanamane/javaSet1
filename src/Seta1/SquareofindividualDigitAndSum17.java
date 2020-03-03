package Seta1;

import java.util.Scanner;

public class SquareofindividualDigitAndSum17 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int num=Sc.nextInt();
		int rem=0;
		int sum=0;
		while(num!=0){
			rem=num%10;
				sum+=rem*rem;
				num=num/10;
			}
			System.out.println(sum);
		}
}
		
		

	



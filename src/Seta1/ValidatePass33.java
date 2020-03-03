package Seta1;

import java.util.Scanner;

public class ValidatePass33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter password:");	
		String patternRegex="^[A-Z](?=.*?[a-zA-z])(?=.*?[0-9])(?=.*?[#@$]).{4,18}[a-z]$";

		while(true){
			String passStr = sc.next();
			if(passStr.matches(patternRegex)){
				System.out.println("Your password is valid");
			}
			else
			{
				System.out.println("Your password is invalid");
			}
		}
	}

}

package Seta1;

import java.util.Scanner;

public class StringFormat39 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String(555-666-1234)");
		String str=sc.next();
		int count=1;
		if(str.length()==12 && str.matches("\\d{3}-\\d{3}-\\d{4}")){
			str=str.replace("-", "");
			for(char ch:str.toCharArray()){
				if(count==3||count==5||count==8)
					System.out.print("-"+ch);
				else
					System.out.print(count==10?ch+"?":ch);
				count++;
			}
		}
		else
			System.out.println("invalid input");
		
	}

}

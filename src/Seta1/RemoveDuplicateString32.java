package Seta1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateString32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String str=sc.nextLine();
		
		Set<Character> finalstr=new HashSet<Character>();
		for(char ch:str.toCharArray()){
			if(!finalstr.contains(ch)){
				finalstr.add(ch);
				System.out.print(ch);
		     }
		}
		System.out.print(" ");
          sc.close();

	}

}

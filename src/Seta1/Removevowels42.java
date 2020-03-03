package Seta1;

import java.util.Scanner;

public class Removevowels42 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String str=sc.next();
		int count=1;
		for(char ch:str.toCharArray()){
			if(count%2==0 &&(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')){
				}
			else
				System.out.print(ch);
			count++;
			}
		}
	}

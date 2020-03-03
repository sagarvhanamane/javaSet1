package Seta1;

import java.util.Scanner;

public class Entername31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter full name: \nFirst name \tMiddle name \tLast name");
		String name=sc.nextLine();
		String nameSeparate[]=name.split(" ");
		String printName="Mr,"+nameSeparate[0].charAt(0)+" "+nameSeparate[1].charAt(0)+" "+nameSeparate[2]+".";
		System.out.println(printName);
		sc.close();
	}

}

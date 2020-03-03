package Seta1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ipadressvalidation35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true){
			System.out.println("Enter IP Address:");
			String IPAddressStr = sc.nextLine();
			String ipStr[] = IPAddressStr.split("[.]");
			boolean ip=true;
			if(ipStr.length==4){
				for(String id:ipStr){
					if(!(Integer.parseInt(id)<=255 && Integer.parseInt(id)>=0)){
						ip=false;
						break;
					}
				}
				
				if(ip){
					 System.out.println("1(valid)");
			    }
				else{
			         System.out.println("2(Invalid)");
				}
			}

	}
}
}
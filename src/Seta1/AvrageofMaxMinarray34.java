package Seta1;

import java.util.Scanner;

public class AvrageofMaxMinarray34 {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter how many integer in array");
      int totalInt=sc.nextInt();
      int []intarray=new int [totalInt];
      System.out.println("Enter "+totalInt+" numbers in arrays seperated by space: this way(3 4 6 1 8)");
      for(int i=0;i<totalInt;i++){
    	  intarray[i]=sc.nextInt();
    	 }
      int min=intarray[0], max=intarray[0];
      for(int i=0;i<intarray.length;i++){
    	  if(min>intarray[i])
    		  min=intarray[i];
    	  else if(max<intarray[i]){
    	  max=intarray[i];
      }
      
	}
    System.out.println((float)(min+max)/2);
	}

}

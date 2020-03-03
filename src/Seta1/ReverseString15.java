package Seta1;

public class ReverseString15 {

	public static void main(String[] args) {
		String s="Selenium";
	
		System.out.printf("Reverse of string %s : \n",s);
		StringBuffer sb = new StringBuffer(s).reverse();
		System.out.println(String.join("-",String.valueOf(sb).split("")));
		
	}

}

package Seta1;

public class Stringpattern23 {

	public static void main(String[] args) {

		String s1="dfs--as--a--";
		String s2="aes--gd--e--";
		boolean result=true;
		for(int i=0;i<s1.length();i++){
			char ch1=s1.charAt(i);
			char ch2=s2.charAt(i);
			if(ch1!='-')
			{
				if(ch2=='-')
				{
					result=false;
					break;
				}
			}
			else{
				if(ch2!='-')
				{
					result=false;
					break;
				}
			}

		}

		System.out.println(result?"True":"False");
	}

}

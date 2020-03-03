package Seta1;

public class concatString18 {

	public static void main(String[] args) {
		String s1="hi";
		String s2="hello";
		
		if(s1.length()==s2.length())
		{
			System.out.println(s1+s2);
		}
		else
		{
			int len;
			if(s1.length()>s2.length())
			{
				len=s1.length()-s2.length();
				System.out.println(s1.subSequence(len-1,s1.length())+s2);
			}
			else
			{
				len=s2.length()-s1.length();
				System.out.println(s1+s2.substring(len-1,s2.length()));
			}
		}
	}

}

package Seta1;

public class AepeatChar26 {

	public static void main(String[] args) {
		String s="Worlld";
		boolean flagCount=true;
		int charCount=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					flagCount=false;
					i++;
					break;
				}
			}
			if(flagCount)
			{
				charCount++;
			}
			flagCount=true;
		}
		System.out.println("No. of non reapting charaters: "+charCount);

	}

}

package Seta1;

public class Maxlength14 {

	public static void main(String[] args) {

		String s= "Hello welcome to selenium";
		String sub[]=s.split(" ");
		String substring="";
		int maxLength=0;
		for(int i=0; i<sub.length; i++)
		{

			if(maxLength<sub[i].length())
			{
				substring=sub[i];
				maxLength=sub[i].length();
			}
		}
		System.out.printf("Largest substring is \"%s\"  and of %d length.",substring,maxLength);

	}

}

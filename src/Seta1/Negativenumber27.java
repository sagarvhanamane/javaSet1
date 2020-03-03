package Seta1;

public class Negativenumber27 {

	public static void main(String[] args) {
		String num="-134";
		try{
			int n=Integer.parseInt(num);
			if(n<0)
				System.out.println(Math.abs(n));
			else
				System.out.println("-1");
		}
		catch(Exception e)
		{
			System.out.println("-1");
			
		}
	}

}

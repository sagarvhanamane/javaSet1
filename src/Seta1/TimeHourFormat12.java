package Seta1;

public class TimeHourFormat12 {
	public static void main(String[] args) {
		String Time="10:30";
		if(Time.contains("P")|| Time.contains("p") || Time.contains("A") ||Time.contains("a")){
		System.out.println("Time format is 12hr");
	}
	else{
		System.out.println("Time format is 24hr");
		
		
	}

	

}}

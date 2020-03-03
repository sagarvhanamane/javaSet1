package Seta1;

import java.time.LocalDateTime;

public class PrintMonthnameFrmDate8 {

	public static void main(String[] args) {
		String dateStr = "18-05-1994";
		String seprDate[]=dateStr.split("-");
		int mon=Integer.parseInt(seprDate[1]);
		int day=Integer.parseInt(seprDate[0]);
		int yr=Integer.parseInt(seprDate[2]);
		
		LocalDateTime x=	LocalDateTime.of(yr, mon, day,0,0);
		System.out.println(x.getDayOfWeek());
		
	}

}
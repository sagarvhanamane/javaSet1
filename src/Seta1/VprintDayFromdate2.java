package Seta1;

import java.time.LocalDateTime;

public class VprintDayFromdate2 {

	public static void main(String[] args) {
		String dateStr = "01-10-2020";
		String seprDate[]=dateStr.split("-");
		int mon=Integer.parseInt(seprDate[1]);
		int day=Integer.parseInt(seprDate[0]);
		int yr=Integer.parseInt(seprDate[2]);
		
		LocalDateTime x=	LocalDateTime.of(yr, mon, day,0,0);
		System.out.println(x.getDayOfWeek());
		
	}

}

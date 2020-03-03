package Seta1;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

public class NoofDaysBetweenTodates30 {

	public static void main(String[] args) {

		SimpleDateFormat myFormat=new SimpleDateFormat("DD MM YYYY");
		String Str1="10 01 2020";
		String Str2="02 02 2020";
		try{
			Date date1=myFormat.parse(Str1);
			Date date2=myFormat.parse(Str2);
			long diff=date2.getTime()-date1.getTime();
			System.out.println("Days: "+TimeUnit.DAYS.convert(diff, TimeUnit.MICROSECONDS));
			
		} catch(ParseException e){
			e.printStackTrace();
		}
		
	}

}
